/*

    # What is Component Scanning?
      - Component Scanning is the process where Spring automatically searches packages for annotated classes and creates Beans for them.

        Imagine your project contains 200 Java classes.
        How does Spring know which classes should become Beans?
        Does Spring check every class manually? No.

        Instead, Spring scans the packages.
        Whenever it finds annotations like: @Component

        it says: "This class should become a Bean."

    Example : 
    Imagine a school.
        The principal says:   "Find all teachers."

        The staff walks through every classroom.

        Whenever they see someone wearing a Teacher ID Card, they register them.

        Mapping:

        Real Life	Spring
        School	Package
        Teacher ID Card	@Component
        Staff searching	Component Scanning
        Registered Teacher	Spring Bean

    Syntax : 
      @Configuration // Marks this class as a configuration class
      @ComponentScan("com.demo") // Tells Spring which package to scan
      public class AppConfig {

      }

    Advantages
      Automatically discovers Beans.
      Eliminates large XML files.
      Faster development.
      Cleaner project structure.
      Preferred in modern Spring applications.
*/