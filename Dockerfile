FROM amazoncorretto:8-alpine-jdk
COPY target/mariaz-0.0.1-SNAPSHOT mariaz-app.jar
ENTRYPOINT ["java","-jar","/mariaz-app.jar"]