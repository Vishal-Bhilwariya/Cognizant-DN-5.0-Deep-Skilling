/*

    # Simplifying Spring Configuration with Boot :
    -Spring Boot simplifies Spring configuration by reducing manual configuration and allowing developers to build applications with minimal setup.

    Why do we need Spring Boot Configuration?
     Suppose you want to create a simple Student Management application.
        Traditional Spring

        Before writing even one Controller, you had to configure:
            web.xml
            DispatcherServlet
            View Resolver
            Bean Configuration
            Tomcat
            Dependencies
        Lots of setup.

     Spring Boot
        You create the project,
        write the Controller,
        run the application.

        Spring Boot configures many things automatically.

    What Configuration Does Spring Boot Simplify?
    1. XML Configuration
     - Traditional Spring
        <bean id="student"
              class="com.demo.Student"/>

     - Spring Boot
        @Component
        public class Student{

        }

        No XML Bean configuration required.

    2. Dependency Management
     - Traditional Spring
        Developer manually adds many dependencies.

     - Spring Boot
        Add one Starter:
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>
                spring-boot-starter-web
            </artifactId>
        </dependency>

        Spring Boot automatically includes the required web libraries.

    3. Embedded Server
     - Traditional Spring
        Install Tomcat separately.
        Deploy WAR file.

     - Spring Boot
        Embedded Tomcat starts automatically.

        No separate installation required.

    4. Bean Configuration
    - Traditional Spring
        Beans were often declared in XML.

    -  Spring Boot
        Beans are commonly registered using annotations.
     Example:
        @Component
        @Service
        @Repository
        @Controller

Advantages
    Less configuration.
    Less XML.
    Faster development.
    Embedded server.
    Easy dependency management.
    Reduced boilerplate code.
    Easy project setup.
*/