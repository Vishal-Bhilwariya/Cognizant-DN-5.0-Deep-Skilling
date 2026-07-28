/*

# What is a Bean?
- A Bean is an object that is managed by the Spring IoC Container.
- In Spring, a Bean is simply a Java object that is instantiated, assembled, and managed by the Spring IoC Container.

  Suppose you write this Java class: 
        public class Student {

        }
    Is it a Bean? No. , It is just a Java class.

    Now suppose Spring creates its object.
        Student student = new Student();
    but Spring creates it instead of you.
    Now it becomes a: Spring Bean

# Why Do We Need Beans?
Imagine a project with 500 classes.
Without Spring: 
        new Student();
        new Teacher();
        new Library();
        new Book();
        new Employee();
        new Customer();
    You manually create every object.

    This leads to:
        More code
        Difficult maintenance
        Tight coupling

    With Spring:
        Spring creates objects for you.
        You simply ask Spring for the object.
        Developer
              │
        Writes Classes
              │
              ▼
        Spring IoC Container
              │
        Creates Beans
              │
        Provides Beans
    You simply ask Spring for the required Bean.

# Defining a Bean in XML 
    public class Engine {

    }
    public class Car {

    }

  XML
    <beans>
        <bean
            id="engine"
            class="com.demo.Engine"/>
        <bean
            id="car"
            class="com.demo.Car"/>
    </beans>

    Spring creates: 
        Engine engine = new Engine();
        Car car = new Car();
        
# Understanding Dependencies :
    class Car {
        Engine engine;

    }
    Question: What does Car need?
    Answer:Engine   So, Engine is Car's dependency.
                Later, Spring will automatically provide the Engine Bean to the Car Bean.

# Advantages
    Centralized object management
    Reduced manual object creation
    Easier maintenance
    Better scalability
    Promotes loose coupling
*/