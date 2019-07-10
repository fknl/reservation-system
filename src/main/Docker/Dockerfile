FROM openjdk:8-jdk

EXPOSE 8761

VOLUME /tmp
ADD maven/reservation-system-0.0.1-SNAPSHOT.jar reservation-system-0.0.1-SNAPSHOT.jar
RUN sh -c 'touch /reservation-system-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/reservation-system-0.0.1-SNAPSHOT.jar"]
