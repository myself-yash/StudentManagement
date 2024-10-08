FROM openjdk:22-jdk

COPY target/SMS2.jar .

EXPOSE 8080

ENTRYPOINT ["java","-jar","SMS2.jar"]