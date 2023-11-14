# Use an official Maven runtime as a parent image
FROM maven:3.8.1-jdk-11

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the Maven project and POM file
COPY . .

# Build the project
RUN mvn clean install

# Define the command to run the application
CMD ["java", "-jar", "target/your-maven-project.jar"]
