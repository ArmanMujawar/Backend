# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the entire project into the working directory inside the container
COPY . . 

# Run Maven build and package the application
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM openjdk:17.0.1-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build container to the runtime container
COPY --from=build /app/target/car-rental-system-0.0.1-SNAPSHOT.jar car-rental-system.jar

# Expose the port the app will run on
EXPOSE 8081

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "car-rental-system.jar"]
