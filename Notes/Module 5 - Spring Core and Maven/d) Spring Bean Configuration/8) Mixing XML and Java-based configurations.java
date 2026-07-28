/*

    # What is Mixing XML and Java-based Configurations?
    - It is a feature in Spring that allows you to use both XML and Java-based configurations in the same application.
    - You can define some beans in XML and others in Java configuration classes.
    - This is useful when you want to gradually migrate from XML to Java configuration or when different teams prefer different approaches.

    Example:
        XML Configuration (beans.xml):
            <bean id="student" class="com.example.Student"/>

        Java Configuration (AppConfig.java):
            @Configuration
            public class AppConfig {
                @Bean
                public Teacher teacher() {
                    return new Teacher();
                }
            }

        In this example, the Student bean is defined in XML, and the Teacher bean is defined in Java.

    # Why Do We Need Mixed Configuration?
     - Imagine a banking application developed in 2015.
        It has:
            beans.xml
                ↓
            500 Bean Definitions

        Now the company upgrades to Spring Boot.

        Should developers rewrite everything?

        That would take a lot of time and introduce risk.

        Instead, they can gradually migrate:

        Old XML Beans
            +
        New Java Configuration
            ↓
        Same Application

    This gradual transition is called Hybrid Configuration.
    - Gradual Migration: When migrating from XML to Java configuration, you can do it step by step.
    - Team Preferences: Different teams might prefer XML or Java configuration.
    - Legacy Code: Some parts of your application might still use XML configuration.
    - Flexibility: You can choose the best approach for each part of your application.

    Diagram : 
                    Spring Application
                        │
        ┌───────────────┴───────────────┐
        │                               │
        ▼                               ▼
   beans.xml                     AppConfig.java
        │                               │
        └───────────────┬───────────────┘
                        ▼
              Spring IoC Container
                        │
                        ▼
                 All Beans Available

    When Do We Use Hybrid Configuration?
    Case 1 : Large enterprise project ( Thousands of XML Beans already exist. )
    Case 2 : Company gradually migrates to Spring Boot.
    Case 3 : Third-party framework provides XML configuration.
    Case 4 : Legacy project maintenance.

    Advantages
        Easy migration from XML to Java.
        No need to rewrite old projects immediately.
        Supports legacy applications.
        Flexible configuration.
        Smooth transition to modern Spring.
*/