/*

    # What is @Component?
    - @Component is a Spring stereotype annotation used to mark a Java class as a Spring Bean.
    - When Spring performs Component Scanning, it detects classes annotated with @Component and registers them as Beans in 
      the IoC Container.

      Suppose you have a Java class:
        public class Student {

        }
        This is just a normal Java class.
        Spring ignores it.

     Now add:
        @Component
        public class Student {

        }
        Now Spring understands: "This class should be managed by me."

     After Component Scanning:

        Student Class
              │
        @Component
              │
        Component Scan
              │
        Spring IoC Container
              │
        Student Bean Created

    # Advantages
        Eliminates XML Bean definitions.
        Cleaner and shorter code.
        Automatic Bean registration.
        Easy maintenance.
        Widely used in Spring Boot.

*/