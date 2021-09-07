FROM maven:3.8.2-jdk-11 as builder
ADD . /
WORKDIR /
RUN mvn clean install test
ENTRYPOINT ["mvn", "spring-boot:run"]
