# Use an official OpenJDK runtime as a parent image
FROM adoptopenjdk/openjdk11:alpine-jre

# Set the working directory to /app
WORKDIR /app

# Copy the executable JAR file and other necessary files from the target folder to the container at /app
COPY target/staffwebservice-0.0.1-SNAPSHOT.jar /app

# Make port 9000 available to the world outside this container
EXPOSE 9000

# Run the executable JAR file when the container launches
CMD ["java", "-jar", "staffwebservice-0.0.1-SNAPSHOT.jar"]