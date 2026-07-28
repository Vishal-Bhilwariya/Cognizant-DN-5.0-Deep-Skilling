/*

    # Constructor Injection :
    - Constructor Injection is a type of Dependency Injection where Spring provides the required dependency through the constructor of a class.
    Suppose we have:
        Car
        Engine

        A Car cannot run without an Engine.

        Instead of the Car creating its own Engine,
        Spring provides the Engine while creating the Car.

        Without Spring:
            Engine engine = new Engine();
            Car car = new Car(engine);

        With Spring:
            Spring IoC Container
                    ↓
            Creates Engine Bean
                    ↓
            Passes Engine to Car Constructor
                    ↓
            Creates Car Bean

    Why Do We Need Constructor Injection?
        Without Constructor Injection:
            class Car {
                Engine engine = new Engine();
            }
        Problems:
            Tight Coupling
            Hard to test
            Hard to replace Engine implementation

        With Constructor Injection:
            class Car {
                private Engine engine;
                public Car(Engine engine) {
                    this.engine = engine;
                }
            }
            Now, Car doesn't create the Engine.
            Spring provides it.

    Real-Life Analogy
        Imagine buying a car.

        When you receive it, the engine is already installed.
        You don't buy the engine separately and install it yourself.

        Mapping:
        Real Life	                            Spring
        Car                                 Company	Spring IoC Container
        Engine	                            Dependency
        Car	                                Main Bean
        Engine installed before delivery	Constructor Injection

    Example Code :

    // Engine.java
    public class Engine {
        public void start() {
            System.out.println("Engine Started");
        }
    }

    // Car.java
    public class Car {
        private Engine engine;

        // Constructor for injecting Engine
        public Car(Engine engine) {
            this.engine = engine;
        }

        public void drive() {
            engine.start();
            System.out.println("Car is running");
        }
    }

    // Main.java
    public class Main {
        public static void main(String[] args) {
            // Spring would handle this
            Engine engine = new Engine();
            Car car = new Car(engine);
            car.drive();
        }
    }

    # XML Constructor Injection
     Older Spring projects use XML:
        <bean id="engine"
              class="com.demo.Engine"/>
        <bean id="car"
              class="com.demo.Car">
        <constructor-arg ref="engine"/>
        </bean>

    Understanding <constructor-arg>
        Attribute	        Purpose
        constructor-arg	Passes a constructor argument
        ref="engine"	References the Engine Bean

        Spring internally performs: new Car(engine);

Advantages
     Promotes Loose Coupling.
     Mandatory dependencies are always initialized.
     Easier unit testing.
     Supports immutable objects (dependencies can be final).
     Recommended by Spring for required dependencies.
*/