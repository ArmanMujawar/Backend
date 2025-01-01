# Build stage
FROM maven:3-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:17-alpine
WORKDIR /app

# Copy the JAR file, allowing for flexibility in case the filename changes or has a different version
COPY --from=build /app/target/*.jar /app/car-rental-system.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "car-rental-system.jar"]
