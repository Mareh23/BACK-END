FROM amazoncorretto:11-alpine-jdk 
maintainer MARIA
COPY target/mariaz-0.0.1-SNAPSHOT.jar mariaz-app.jar
ENTRYPOINT ["java", "-jar", "/mariaz-app.jar"]
