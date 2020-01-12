FROM centos
RUN yum install -y java
VOLUME /temporary11
COPY . /usr/src/app
EXPOSE 8768
ADD /docker-example-0.0.1-SNAPSHOT.jar dockernew.jar
RUN sh -c 'touch /dockerenw.jar'
ENTRYPOINT ["java", "-jar", "/dockernew.jar"]


