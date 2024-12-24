# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build

COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM openjdk:17.0.1-jdk-slim

COPY --from=build /app/target/car-rental-system-0.0.1-SNAPSHOT.jar car-rental-system.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "car-rental-system.jar"]
