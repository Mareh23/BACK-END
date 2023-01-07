FROM amazoncorretto:18-alpine-jdk
MAINTAINER emaaristimuno
COPY target/mariaz-0.0.1-SNAPSHOT.jar mariaz-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mariaz-0.0.1-SNAPSHOT.jar"]

EXPOSE 3306
