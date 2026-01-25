FROM node:25-alpine

WORKDIR /app

COPY package.json .

RUN npm install

COPY consumer.js .

CMD ["npm", "start"]
