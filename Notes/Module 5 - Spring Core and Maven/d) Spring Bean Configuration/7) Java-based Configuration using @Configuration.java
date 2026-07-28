/*

    # What is Java-based Configuration?
    - Java-based Configuration means using Java classes instead of XML files to configure the Spring IoC Container.

    Previously, we created Beans like this:
     XML Approach
        <bean id="student"
              class="com.demo.Student"/>

     Now, instead of XML, we use Java:
        @Configuration
        public class AppConfig {

        }

        This Java class replaces most of the work previously done by beans.xml.

    # What is @Configuration?
    - @Configuration is a Spring annotation that marks a Java class as a Configuration Class.
    It tells Spring: "This class contains Bean definitions and configuration information."

 Imagine you're giving directions.

    Old Method
        Paper instructions.
            Go Left
            Go Right
            Turn Right

        (XML)
            Modern Method
            Google Maps.
            (Java Configuration)

        More interactive and easier to maintain.

Advantages
 No XML required.
 Type-safe (checked by the Java compiler).
 Better IDE support.
 Easier refactoring.
 Preferred in Spring Boot.
*/