FROM openjdk:8-jdk-alpine


WORKDIR /app


COPY target/*.jar app.jar


EXPOSE 2023


ENTRYPOINT ["java", "-jar", "app.jar"]
