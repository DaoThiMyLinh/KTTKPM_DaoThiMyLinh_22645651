const amqp = require("amqplib");

const RABBITMQ_URL = "amqp://user:password@rabbitmq:5672";
const QUEUE = "message_queue";

async function connectWithRetry() {
  try {
    const conn = await amqp.connect(RABBITMQ_URL);
    const channel = await conn.createChannel();

    await channel.assertQueue(QUEUE);

    channel.consume(QUEUE, (msg) => {
      if (msg) {
        channel.ack(msg);
      }
    });
  } catch (err) {
    setTimeout(connectWithRetry, 3000);
  }
}

connectWithRetry();
