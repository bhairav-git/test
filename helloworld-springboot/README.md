# Helloworld Spring Boot Application

This is a simple Spring Boot application that demonstrates how to create a "Hello World" RESTful service.

## Project Structure

```
helloworld-springboot
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── helloworld
│   │   │               ├── HelloworldApplication.java
│   │   │               └── controller
│   │   │                   └── HelloWorldController.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── helloworld
│                       └── HelloworldApplicationTests.java
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Prerequisites

- Java 11 or higher
- Maven

## Running the Application

1. Navigate to the project directory:
   ```
   cd helloworld-springboot
   ```

2. Run the application using Maven:
   ```
   ./mvnw spring-boot:run
   ```

3. Access the application in your web browser or via a tool like Postman:
   ```
   http://localhost:8080/hello
   ```

You should see a greeting message: "Hello, World!"

## Building the Application

To build the application, run the following command:
```
./mvnw clean package
```

This will create a JAR file in the `target` directory.

## Testing

To run the tests, use the following command:
```
./mvnw test
```

## License

This project is licensed under the MIT License.