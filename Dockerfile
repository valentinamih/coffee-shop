FROM openjdk:17
COPY ./ ./
RUN sh gradlew --no-daemon bootJar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "build/libs/coffee-shop-0.0.1-SNAPSHOT.jar"]