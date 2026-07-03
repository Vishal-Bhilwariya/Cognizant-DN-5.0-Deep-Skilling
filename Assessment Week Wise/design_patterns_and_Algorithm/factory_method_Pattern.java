interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car Started");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike Started");
    }
}

abstract class VehicleFactory {
    abstract Vehicle createVehicle();

    public void useVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.start();
    }
}

class CarFactory extends VehicleFactory {
    Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    Vehicle createVehicle() {
        return new Bike();
    }
}

public class factory_method_Pattern {
    public static void main(String[] args) {

        VehicleFactory vf1 = new CarFactory();
        vf1.useVehicle();

        VehicleFactory vf2 = new BikeFactory();
        vf2.useVehicle();
    }
}
/*
Factory Method Pattern
Simple Definition

Factory Method Pattern is a creational design pattern that creates objects without exposing 
the object creation logic to the client.

Easy to Remember

"Ask the factory to create the object instead of creating it yourself."

Real-Life Example: Pizza Shop 🍕

Imagine you go to a pizza shop.

You say,

"I want a Veg Pizza."

You don't cook it yourself.

The pizza shop (Factory) decides:

Which ingredients to use
How to prepare it
Which pizza object to create

You simply receive the finished pizza.

Customer
      ↓
  Pizza Factory
      ↓
 Veg Pizza / Cheese Pizza / Farmhouse Pizza

The customer doesn't know how the pizza is made; they only request the type.

Another Real-Life Example

Think about ordering a cab.

You
 ↓
Uber App (Factory)
 ↓
Bike / Auto / Car

You only request a ride.

The Uber app decides which vehicle object to create based on your selection.




Factory Method Pattern is a creational design pattern that creates objects through
 a factory instead of directly using the new keyword. A real-life example is a pizza
  shop where the customer requests a pizza, and the shop decides how to prepare and return the correct pizza.

*/