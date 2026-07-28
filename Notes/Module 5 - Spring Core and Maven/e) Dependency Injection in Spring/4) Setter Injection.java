/*

    # Setter Injection :
    - Setter Injection is a type of Dependency Injection where Spring injects the required dependency through a setter method
    
    Suppose we have:
        Car 
        Engine
        A Car can receive its Engine after the Car object has been created.

        Instead of:
            Car car = new Car(engine);

        Spring does:
            Car car = new Car();
            car.setEngine(engine);

        The dependency is injected using the setter method.

    Imagine buying a desktop computer.
        When you buy it:
            Computer
        Later you install:
            Printer
            Webcam
            Speakers
        These accessories are added after purchasing the computer.

        Mapping:

        Real Life	    Spring
        Computer	    Car Bean
        Printer     	Dependency
        Install Later	Setter Injection

        Unlike Constructor Injection, the dependency is not provided during object creation.

Advantages
    Suitable for optional dependencies.
    Dependency can be changed later.
    Easier to configure in some scenarios.
    More flexible than Constructor Injection.
*/