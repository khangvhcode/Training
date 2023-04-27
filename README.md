### docker 
- docker build --tag=backend:0.0.1 . 
// backend:0.0.1 : ten images va version duoc tao
### run 
- docker run -p 8080:8080 -d backend:0.0.1
// -p: port du an 
// -d: ten images va vesion chay
// Truong hop tai docker file co cau hinh them mot vai param dong de truyen vao docker run -e DB_HOST=<host> -e DB_PORT=<port> -e DB_NAME=<name> -e DB_USERNAME=<username> -e DB_PASSWORD=<password> <image_name>