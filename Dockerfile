FROM openjdk:8
ADD target/microservice-0.0.1-SNAPSHOT.jar microservice-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "microservice-0.0.1-SNAPSHOT.jar"]