/*

    # Factory Method Pattern :
    - Factory Method Pattern provides a way to create objects without specifying their exact class.
    
    Normally, we create objects using:
        Car car = new Car();
        Bike bike = new Bike();

    The client knows which object to create.
    In Factory Method,
        the client simply asks the Factory.
        Vehicle v = VehicleFactory.getVehicle("Car");
        The Factory decides which object to create.

    # Why Do We Need Factory Pattern?
     - Suppose you're developing a Vehicle Showroom.

        Without Factory:
            Car car = new Car();
            Bike bike = new Bike();
            Bus bus = new Bus();
            Truck truck = new Truck();

        Whenever a new vehicle is added, the client code changes.
        Violates Open/Closed Principle (OCP).

        Solution
            Use a Factory.
             Client says:
                I want a Car.
             Factory creates it.
            Client doesn't know how it was created.

                Vehicle
                   ▲
        -----------------------
        |         |          |
      Car       Bike       Bus

                   ▲
                   |
          VehicleFactory

                   ▲
                   |
                 Client

    Advantages
        Hides object creation.
        Reduces coupling.
        Easy to add new object types.
        Supports OCP.
        Centralizes object creation.
    Disadvantages
        Requires an extra Factory class.
        Factory can become large if many object types are added.
        Simple implementations may use long if-else or switch statements, which may need refactoring as the application grows.
*/