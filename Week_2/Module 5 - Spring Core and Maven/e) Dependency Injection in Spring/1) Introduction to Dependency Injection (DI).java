/*

    # Introduction to Dependency Injection (DI):
    - Dependency Injection (DI) is a design pattern where objects receive their dependencies from external sources rather than creating them itself.
    - It promotes loose coupling and makes code more modular and testable.
    - In Spring, DI is achieved through the Inversion of Control (IoC) container.

    Suppose we have two classes:
        Car
        Engine
       A Car cannot run without an Engine.
       So,
        Car depends on Engine.

      Instead of writing:
        Engine engine = new Engine();

        Spring automatically provides the Engine object to the Car.
        This is called Dependency Injection.

    # What is a Dependency?
    - A dependency is an object that a class needs to function.
    - For example, a Car needs an Engine to run.
    - The Engine is a dependency of the Car.

    # What is Injection?
    - Injection means providing the dependency to the class.
    - Instead of the class creating the dependency, it is provided from outside.
    - This is done by the Spring IoC Container.

    Why Do We Need Dependency Injection?
     Imagine a project with:
        200 Services
        100 Repositories
        50 Utility Classes

     Without DI:
        Every class creates its own dependencies.
            new StudentRepository();
            new EmployeeRepository();
            new PaymentRepository();

     Problems:
        Tight Coupling
        Difficult Testing
        Difficult Maintenance
        Code Duplication

    With DI:
        Spring IoC Container
            ↓
        Creates Repository
            ↓
        Injects Repository into Service

      The developer focuses on business logic, not object creation.

  Example : 
    Without DI:
        class Engine {
            public void start() {
                System.out.println("Engine Started");
            }
        }
        class Car {
            // Car creates its own dependency (Tight Coupling)
            Engine engine = new Engine();
            public void drive() {
                engine.start();
                System.out.println("Car Running");
            }
        }

    With DI:
        class Engine {
            public void start() {
                System.out.println("Engine Started");
            }
        }
        class Car {
            private Engine engine;
            // Dependency is provided from outside
            public Car(Engine engine) {
                this.engine = engine;
            }
            public void drive() {
                engine.start();
                System.out.println("Car Running");
            }
        }

    Advantages
        Reduces Tight Coupling.
        Promotes Loose Coupling.
        Easier Testing (dependencies can be replaced with mocks).
        Better Maintainability.
        Reusable code.
        Easier to modify and extend.

*/
