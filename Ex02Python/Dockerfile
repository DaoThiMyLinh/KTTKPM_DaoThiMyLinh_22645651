FROM python:3.9

# Tạo thư mục làm việc
WORKDIR /app

# Copy file requirements trước
COPY requirements.txt .

# Cài thư viện
RUN pip install --no-cache-dir -r requirements.txt

# Copy code
COPY . .

# Expose port
EXPOSE 5000

# Chạy app
CMD ["python", "app.py"]