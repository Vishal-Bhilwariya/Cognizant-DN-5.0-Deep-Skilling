/*

# Decorator Pattern : 
- Decorator Pattern is a Structural Design Pattern that adds new functionality to an existing object without changing its original class.

Suppose you have a Coffee.
Initially: Coffee
Now the customer wants:
    Milk
    Sugar
    Chocolate
Instead of modifying the Coffee class every time, we decorate the Coffee object with additional features.

    Coffee
       ↓
    + Milk
       ↓
    + Sugar
       ↓
    + Chocolate
       ↓
    Final Coffee
    The original Coffee class remains unchanged.

          Coffee
             ▲
             |
     -----------------
     |               |
 SimpleCoffee   CoffeeDecorator
                      ▲
          ----------------------
          |                    |
     MilkDecorator      SugarDecorator

Advantages
    Adds functionality without modifying existing code.
    Supports Open/Closed Principle (OCP).
    Flexible and reusable.
    Avoids creating many subclasses.
    Features can be added or removed dynamically.
Disadvantages
    Many decorator classes may be created.
    Object structure becomes more complex.
    Debugging can be slightly harder due to multiple wrappers
*/