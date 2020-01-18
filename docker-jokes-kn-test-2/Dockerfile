FROM openjdk:8-jre
COPY . /opt
ADD . /usr/src
VOLUME /jokes-kubernetes-test
EXPOSE 8280
ADD /jokesapplication-0.0.1-SNAPSHOT.jar jokes.jar
RUN sh -c 'touch /jokes.jar'
ENTRYPOINT ["java", "-jar", "/jokes.jar"]

