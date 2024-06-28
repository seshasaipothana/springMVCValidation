# Spring Boot Validation Demo

This project demonstrates form validation in a Spring Boot application using Thymeleaf templates and Hibernate Validator.

## Prerequisites

- Java 11 or higher
- Maven 3.0+ (for building the project)

## Getting Started

To run this project locally, follow these steps:

1. Clone the repository:-
   ```bash
   git clone https://github.com/yourusername/spring-boot-validation-demo.git
   cd spring-boot-validation-demo
Build the project using Maven:-

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn spring-boot:run
Open your web browser and navigate to http://localhost:8080/show to view the application.

Features:-
Form Validation: Validates user input for fields like first name, last name, age, postal code, and custom IFSC code.
Custom Validation: Implements a custom validator for IFSC codes using annotations.
Data Binding: Uses Spring's @ModelAttribute for data binding in form submissions.
Trimming Input: Configures Spring to automatically trim input strings using StringTrimmerEditor.
Error Handling: Displays validation errors on the form using Thymeleaf.

Technologies Used:-
Spring Boot
Thymeleaf
Hibernate Validator (JSR 380)
Maven
Configuration
application.properties: Contains application-specific configurations, such as server port and error messages.
Structure
src/main/java/com/springDemo/mvc/: Java source files, including controllers, models, validators, and main application class.
src/main/resources/templates/: Thymeleaf templates for rendering HTML views.
pom.xml: Maven configuration file listing dependencies and build settings.

Contributing:-
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
