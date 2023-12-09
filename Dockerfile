FROM bellsoft/liberica-openjdk-debian:21
LABEL maintainer="hendisantika@yahoo.co.id"
VOLUME /tmp
EXPOSE 8081
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-minio-1.0.0-RELEASE.jar
ENTRYPOINT ["java","-jar","spring-boot-minio-1.0.0-RELEASE.jar"]
