FROM openjdk:8-jdk-alpine

USER 185
VOLUME /tmp
COPY target/testing-web-complete-0.0.1-SNAPSHOT.jar /tmp/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/tmp/app.jar"]
