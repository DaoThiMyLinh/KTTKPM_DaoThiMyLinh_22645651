FROM node:18

# Tạo thư mục làm việc
WORKDIR /app

# Copy file package trước (optimize cache)
COPY package.json .

# Install dependencies (ở đây không có nhưng vẫn nên giữ)
RUN npm install

# Copy toàn bộ code
COPY . .

# Expose port
EXPOSE 3000

# Chạy app
CMD ["npm", "start"]