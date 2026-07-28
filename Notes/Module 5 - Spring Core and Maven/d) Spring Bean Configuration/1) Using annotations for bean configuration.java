/*

    # What is an Annotation?
    - An Annotation is a special marker in Java that starts with the @ symbol.
    - It provides additional information (metadata) to the compiler or framework. 

    Think of an annotation as a sticky note attached to your code.
    Imagine your teacher writes on your notebook: "Check this answer carefully."
    
    That note doesn't change your answer.
    It only provides extra information.

    Ex: @Override
        public String toString() {

        }

    Here @Override doesn't contain business logic.
    It simply tells Java: "This method is overriding a method from the parent class."

    # Before Spring
        Until now, we've been doing this:
            Java Class
                ↓
            beans.xml
                ↓
            Spring Creates Bean

        Example:
            <bean
            id="student"
            class="com.demo.Student"/>

            Every class had to be written in XML.

        Problem with XML
            Imagine a project with 500 classes.
            Your beans.xml might look like:
                <bean .../>
                <bean .../>
                <bean .../>
                <bean .../>
                <bean .../>
                <bean .../>

            Hundreds of Bean definitions.

        Problems:
            Very long XML files.
            Difficult to maintain.
            Easy to make mistakes.
            Need to update XML whenever a new class is added.
            Spring's Solution

        Spring introduced Annotations.
        Instead of writing:
            <bean
            id="student"
            class="com.demo.Student"/>

        You simply write:
            @Component
            public class Student {

            }

        Spring understands: "Create a Bean for this class."
            
    # Why Do We Need Annotation-Based Configuration?
    Let's compare : 
    XML Configuration
        Student.java
            ↓
        beans.xml
            ↓
        Spring Reads XML
            ↓
        Creates Bean
        
    Annotation Configuration
        Student.java
            ↓
        @Component
            ↓
        Spring Reads Annotation
            ↓
        Creates Bean

     - No separate XML configuration for each Bean.

    Benefits : 
        Less XML
        Cleaner code
        Easier maintenance
        Faster development
        Preferred in modern Spring projects

    Common Spring Annotations (Overview)
    Annotation	        Purpose
    @Component	        General-purpose Bean
    @Service	        Business logic layer
    @Repository	        Database layer
    @Controller	        Handles web requests
    @Configuration	    Java configuration class
    @Bean	            Declares a Bean manually
        
    #XML vs Annotation Configuration
    XML Configuration	            Annotation Configuration
    Bean defined in beans.xml	    Bean defined in Java class
    More XML code	                Less XML
    Harder to maintain	            Easier to maintain
    Used in older Spring projects	Used in modern Spring & Spring Boot
    External configuration	        Configuration close to the class
        
    # Advantages
    - Less XML configuration
    - Cleaner code
    - Easier maintenance
    - Faster development
    - Preferred in modern Spring applications
    - Better readability
        
*/