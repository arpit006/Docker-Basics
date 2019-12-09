FROM centos
RUN yum install -y java
VOLUME /temporary1
ADD /docker-example-0.0.1-SNAPSHOT.jar docker1.jar
RUN sh -c 'touch /docker1.jar'
ENTRYPOINT ["java", "-jar", "/docker1.jar"]


