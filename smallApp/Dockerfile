FROM openjdk:8
VOLUME /tempSmallApp
ADD /build/libs/smallApp-0.0.1-SNAPSHOT.jar smallApp.jar
RUN sh -c 'touch /smallApp.jar'
EXPOSE 8282
ENTRYPOINT ["java", "-jar", "/smallApp.jar"]
