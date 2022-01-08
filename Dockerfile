FROM openjdk:11
COPY target/app.jar /tmp
WORKDIR /tmp
CMD java -jar app.jar