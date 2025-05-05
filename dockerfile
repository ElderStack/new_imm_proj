# Use the official OpenJDK base image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Java application into the container
COPY src\main\java\new_imm_proj\App.class /app

# Run the Java application when the container starts
CMD ["java", "HelloWorld"]