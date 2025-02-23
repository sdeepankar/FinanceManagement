# Base image Java 17
FROM openjdk:17-jdk-slim

# Author
MAINTAINER github.com/sdeepankar

# Copy the jar file
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Set the startup command to execute the jar
ENTRYPOINT ["java","-jar","/accounts-   0.0.1-SNAPSHOT.jar"]