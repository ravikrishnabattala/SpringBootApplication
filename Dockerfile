FROM eclipse-temurin:17-jdk

LABEL authors="ravik"

WORKDIR /app

COPY target/SpringBootApplication-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]


