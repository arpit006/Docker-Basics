FROM openjdk:8
VOLUME /tempWallet
ADD /crud-spring-boot-1.0-SNAPSHOT.jar wallet.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/wallet.jar"]
