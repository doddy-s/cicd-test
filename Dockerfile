FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/cicd-test-0.0.1-SNAPSHOT.jar /app/cicd-test.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/cicd-test.jar"]
