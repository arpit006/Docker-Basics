FROM openjdk:8
VOLUME /tempJokes
ADD /target/jokesapplication-0.0.1-SNAPSHOT.jar myjokes.jar
RUN sh -c 'touch  /myjokes.jar'
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/myjokes.jar"]
