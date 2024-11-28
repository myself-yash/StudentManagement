FROM openjdk:20

COPY target/SMS.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "SMS.jar"]