# Student Management System with Spring Boot

## Overview
This project is a Spring Boot application designed to demonstrate the use of Spring Data JPA with an H2 database. It includes basic CRUD operations for managing student entities and showcases the use of Lombok for reducing boilerplate code.

## Project Structure
The project is organized as follows:

```
spring-boot-lab
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── SpringBootLabApplication.java
│   │   │           ├── config
│   │   │           │   └── AppConfig.java
│   │   │           ├── entity
│   │   │           │   └── Student.java
│   │   │           ├── repository
│   │   │           │   ├── StudentRepository.java
│   │   │           │   └── StudentPagingRepository.java
│   │   │           └── service
│   │   │               └── StudentService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── SpringBootLabApplicationTests.java
|                   └── HelloWorldTest.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the repository**:
   ```
   git clone https://github.com/Trunks-Pham/students-management-spring-boot.git
   cd spring-boot-lab
   ```

2. **Build the project**:
   Ensure you have Maven installed, then run:
   ```
   mvn clean install
   ```

3. **Run the application**:
   You can run the application using:
   ```
   mvn spring-boot:run
   ```

## Usage
- The application starts with a CommandLineRunner that initializes the database with sample student data.
- You can interact with the student data through the repository interfaces provided.

## Dependencies
This project uses the following dependencies:
- Spring Boot Starter
- Spring Data JPA
- H2 Database
- MySQL Database  
- Lombok

## Testing
Unit tests are included in the `src/test/java/com/example/SpringBootLabApplicationTests.java` file to ensure the application functions as expected.