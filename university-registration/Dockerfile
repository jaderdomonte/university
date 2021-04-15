FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/university-registration-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT exec java -jar /app.jar