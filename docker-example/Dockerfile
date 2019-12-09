FROM openjdk:8
ADD build/libs/docker-example-0.0.1-SNAPSHOT.jar docker3.jar
EXPOSE 8768
ENTRYPOINT ["java", "-jar", "/docker3.jar"]
