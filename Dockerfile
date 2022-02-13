FROM openjdk:17
COPY ./ ./
RUN sh gradlew
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "build/libs/demo-0.0.1-SNAPSHOT.jar"]