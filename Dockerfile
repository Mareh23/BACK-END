FROM amazoncorreto:18-alpine-jdk
MAINTAINER MARIA
COPY target/mariaz-0.0.1-SNAPSHOT.jar mariaz-app.jar
ENTRYPOINT ["java","-jar","/mariaz-app.jar"]
