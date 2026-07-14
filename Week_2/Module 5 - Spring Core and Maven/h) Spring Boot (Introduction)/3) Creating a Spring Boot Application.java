/*

    # Creating a Spring Boot Application :
    A Spring Boot Application is a Java application built using Spring Boot that can be started with very little configuration.

    Creating a Spring Boot Project
        Most developers create projects using Spring Initializr.
        Provide:
            Project Type → Maven
            Language → Java
            Spring Boot Version
            Group
            Artifact
            Dependencies
        Then download the project.

    Folder Structure
        StudentManagement/
        │
        ├── src
        │   ├── main
        │   │     ├── java
        │   │     │      └── DemoApplication.java
        │   │     │
        │   │     └── resources
        │   │             ├── application.properties
        │   │             ├── static
        │   │             └── templates
        │
        ├── pom.xml
        │
        └── mvnw

    Important Files
    1. pom.xml
        Purpose
            Manages Maven dependencies.
            Controls project build.

        Example Dependency
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>
                spring-boot-starter-web
            </artifactId>
        </dependency>
        
    2. application.properties
        Stores configuration.
        Example : server.port=8081

        spring.application.name=StudentApp
        
    3. Main Class
        Every Spring Boot application has one main class.
        Example
        @SpringBootApplication
        public class DemoApplication {
            public static void main(String[] args){
                SpringApplication.run(
                        DemoApplication.class,args);
            }
        }

Advantages
    Easy project creation.
    Standard project structure.
    Embedded Tomcat.
    Fast setup.
    Easy dependency management.
    Production-ready architecture.
*/
