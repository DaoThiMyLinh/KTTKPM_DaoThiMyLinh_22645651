const amqp = require("amqplib");

const RABBITMQ_URL = "amqp://user:password@rabbitmq:5672";
const QUEUE = "message_queue";
const DEAD_LETTER_QUEUE = "message_queue.dlq";

let channel;

async function connectWithRetry() {
  try {
    const conn = await amqp.connect(RABBITMQ_URL);
    channel = await conn.createChannel();

    await channel.assertQueue(DEAD_LETTER_QUEUE, { durable: true });

    await channel.assertQueue(QUEUE, {
      durable: true,
      deadLetterExchange: "",
      deadLetterRoutingKey: DEAD_LETTER_QUEUE,
    });

    console.log("Consumer connected to RabbitMQ");
    console.log(`Waiting for messages in queue: ${QUEUE}`);

    channel.consume(
      QUEUE,
      async (msg) => {
        if (!msg) return;

        const body = msg.content.toString();
        console.log("Received:", body);

        try {
          const data = JSON.parse(body);

          if (!data.message) {
            throw new Error("Message is required");
          }

          console.log("Processing message:", data.message);
          await new Promise(resolve => setTimeout(resolve, 3000));

          console.log("✓ Message processed successfully");
          channel.ack(msg);
        } catch (err) {
          console.error("✗ Error processing message:", err.message);
          console.log("Sending to DLQ...");
          channel.nack(msg, false, false);
        }
      },
      { noAck: false }
    );

  } catch (err) {
    console.log("Waiting for RabbitMQ...");
    setTimeout(connectWithRetry, 3000);
  }
}

connectWithRetry();
