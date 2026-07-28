/*

# What is Spring Framework?
- Spring Framework is an open-source Java framework that helps developers build Java applications more easily, quickly, and efficiently.
- It provides many pre-built features so that developers don't have to write everything from scratch.

    Imagine you have to build a house.
    You can either:
        Buy every brick, cement, and tool separately and build everything yourself.
        Or use a ready-made construction kit that already contains everything you need.

        Spring Framework is like that ready-made construction kit for Java developers.

        Instead of writing thousands of lines of repetitive code, Spring provides them for you.
# What is a Framework?
 Before understanding Spring, you must know what a framework is.
 - A Framework is a collection of pre-written code, libraries, and rules that helps developers build applications faster.
    It provides a structure for your project.

    Without Framework
        Developer
           |
        Writes everything manually

    With Framework
        Developer
              |
        Spring Framework
              |
        Provides ready-made features

# Why do we need Spring Framework?
    Before Spring existed, developers mainly used Java EE to build enterprise applications.

    Problem 1: Too Much Boilerplate Code
        Developers had to write a lot of repetitive code.
        Example:
            Database connection
            Object creation
            Exception handling
            Transaction management
        Even simple applications became very lengthy.

    Problem 2: Tight Coupling
        Classes directly created other objects.
        Example:
            Car car = new Car();
            Engine engine = new Engine();

        Every class became dependent on another class.
        Changing one class often required changes in many other classes.
        We'll understand this deeply in the Dependency Injection topic.
    
    Problem 3: Difficult Testing
        Since objects were created manually, writing unit tests became difficult.

    Problem 4: Difficult Maintenance
        Large projects contained thousands of classes.
        Managing everything manually became complicated.

    Problem 5: Poor Reusability
        Code was tightly connected, making it difficult to reuse.

    Spring Solves These Problems
        Traditional Java	  Spring Framework
        More coding	            Less coding
        Manual object creation	Automatic object management
        Difficult testing	    Easy testing
        Tightly coupled code	Loosely coupled code
        Hard maintenance	    Easy maintenance

    # Conclusion
        Spring Framework is a powerful tool that simplifies Java development.
        It reduces boilerplate code, promotes loose coupling, and makes testing and maintenance easier.
    
    #Example: Restaurant 
    - Imagine you visit a restaurant.
      Without Spring:
        You must:
            Cook the food
            Arrange utensils
            Wash dishes
            Serve yourself
        Everything is your responsibility.

      With Spring:
        You simply order food.
        The restaurant:
            Prepares food
            Serves food
            Cleans dishes
            Manages everything
        You only enjoy the meal.

        - Spring works in a similar way—it handles much of the application's infrastructure so you can focus on writing business logic.

    # Spring Modules (Overview)
    - Spring is not a single library. It is a framework made up of many independent modules.
    - It consists of many modules.
    
    Think of Spring like a toolbox 🧰.
        A toolbox is not just one tool.
        It contains a screwdriver, hammer, wrench, pliers, etc.
        You use only the tools you need.
        
        Similarly, Spring contains many modules. You include only the modules required for your project.
        
    Why are there different modules?
        Imagine you are building different types of applications.

        A Console Application  doesn't need web features.
        A Web Application  needs MVC.
        A Banking Application  needs database support.
        A Large Enterprise Application needs security, transactions, logging, etc.

        Instead of putting everything into one huge library, Spring divides features into modules.

        Module	            Purpose
        Core	    Core features of Spring
        IoC	        Manages object creation (covered later)
        AOP	        Handles cross-cutting concerns like logging
        Data         Access	Simplifies database operations
        ORM	        Integrates with Hibernate and other ORM tools
        MVC	        Build web applications
        Boot	    Quickly create Spring applications
    # Benefits of Using Spring
    - Reduces code
    - Easy to maintain
    - Easy to test
    - Modular architecture
    - Supports enterprise applications
    - Integrates with many technologies
    - Improves developer productivity
*/