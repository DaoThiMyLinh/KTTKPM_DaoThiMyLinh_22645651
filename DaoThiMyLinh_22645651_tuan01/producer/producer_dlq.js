  const express = require("express");
  const amqp = require("amqplib");

  const app = express();
  app.use(express.json());

  const RABBITMQ_URL = "amqp://user:password@rabbitmq:5672";
  const QUEUE = "message_queue";
  const DEAD_LETTER_QUEUE = "message_queue.dlq";

  let channel;

  async function connectRabbitMQ() {

    while (true) {
      try {
        const conn = await amqp.connect(RABBITMQ_URL);
        channel = await conn.createChannel();
        await channel.assertQueue(QUEUE, {
          durable: true,
          deadLetterExchange: "",     
          deadLetterRoutingKey: DEAD_LETTER_QUEUE,
        });
        break;
      } catch {
        await new Promise((r) => setTimeout(r, 3000));
      }
    }
  }

  app.post("/send", async (req, res) => {
    const { message } = req.body;

    if (!message) {
      return res.status(400).json({ error: "Message is required" });
    }

    const data = {
      message: message,
      timestamp: new Date()
    };

    channel.sendToQueue(
        QUEUE,
        Buffer.from(JSON.stringify(data)),
        {
          persistent: true 
        }
    );

    res.json({status: "sent", dataSent: data});

  });

  connectRabbitMQ();

  app.listen(3000, () => {
    console.log("Producer API listening on port 3000");
  });
