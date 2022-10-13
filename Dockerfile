FROM openjdk:11
WORKDIR /patrimony-back
COPY target/patrimony-back-0.0.1-SNAPSHOT.jar .
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "patrimony-back-0.0.1-SNAPSHOT.jar"]