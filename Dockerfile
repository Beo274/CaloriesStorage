FROM openjdk:24
ADD /target/CPFCCounter-1.0-SNAPSHOT.jar backend.jar
ENTRYPOINT ["java", "-jar", "backend.jar"]