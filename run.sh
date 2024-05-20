#запускаем приложения
cd client_new
mvn spring-boot:run &
cd ..
cd eureka-server
mvn spring-boot:run &
cd ..
cd server_new
mvn spring-boot:run &
cd ..

#поднимаем prometheus и grafana
docker-compose up -d