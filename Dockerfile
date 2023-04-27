# Sử dụng base image là OpenJDK 17
FROM openjdk:17-jdk-alpine3.13

# Copy file .jar vào thư mục 
COPY target/Training-0.0.1-SNAPSHOT.jar Training-0.0.1-SNAPSHOT.jar

# Sử dụng lệnh ENTRYPOINT để chạy ứng dụng khi container được khởi chạy
ENTRYPOINT ["java","-jar","Training-0.0.1-SNAPSHOT.jar"]
