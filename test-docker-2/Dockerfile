FROM openjdk:8
VOLUME /temporary2
ADD /docker-example-0.0.1-SNAPSHOT.jar docker2.jar
EXPOSE 8768
ENTRYPOINT ["java", "-jar", "/docker2.jar"]

