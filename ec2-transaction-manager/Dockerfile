FROM openjdk:8-alpine as build
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
RUN /bin/sh -c 'ls -la; chmod +x ./gradlew; ls -la'
# Change this to clean and build if dependencies doesn't work
RUN ./gradlew dependencies

COPY src src
RUN ./gradlew bootJar
EXPOSE 8080
ENTRYPOINT java -jar build/libs/*.jar