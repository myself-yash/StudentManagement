FROM openjdk:22-jdk

COPY target/SMS.jar .

EXPOSE 8080

ENTRYPOINT ["java","-jar","SMS.jar"]