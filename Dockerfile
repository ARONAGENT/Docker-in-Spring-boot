FROM maven:3.9.4-eclipse-temurin-21-alpine

WORKDIR /apps

COPY /target/dockerize_app-0.0.1-SNAPSHOT.jar .

CMD ["java" , "-jar", "dockerize_app-0.0.1-SNAPSHOT.jar"]


