# Build stage
FROM maven:3-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:17-alpine
WORKDIR /app
COPY --from=build /app/target/car-rental-system-0.0.1-SNAPSHOT.jar car-rental-system.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "car-rental-system.jar"]
