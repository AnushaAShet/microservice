FROM openjdk:11-jdk-stretch
ADD target/testdemo-0.0.1-SNAPSHOT.jar /src/main/testdemo-0.0.1-SNAPSHOT.jar
WORKDIR /src/main
ENTRYPOINT ["java","-jar","testdemo-0.0.1-SNAPSHOT.jar"]