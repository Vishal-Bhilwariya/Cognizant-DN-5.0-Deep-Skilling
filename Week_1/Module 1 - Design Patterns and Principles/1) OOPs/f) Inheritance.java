/*

# Inheritance :
 -> Inheritance is an OOP feature in which one class acquires (inherits) the properties and methods of another class.
    (Inheritance allows one class to reuse the code of another class)
 -> The class whose properties are inherited is called the Parent Class (or Base Class or Superclass).
 -> The class that inherits the properties is called the Child Class (or Derived Class or Subclass).

 Problem Without Inheritance
  Suppose we have two classes.
    Car
        class Car {
            void start() {
                System.out.println("Car Starts");
            }
        }
    Bike
        class Bike {
            void start() {
                System.out.println("Bike Starts");
            }
        }

    Both classes have the same start() method.
    If there are 100 vehicle types, we would write the same code 100 times.
    This causes code duplication.
 Solution
    Create a common parent class.
                     Vehicle
                       |
               --------------------
               |        |         |
             Car      Bike      Bus
        Now all child classes reuse the common code.
    class Vehicle {
        void start() {
            System.out.println("Vehicle Starts");
        }
    }
    class Car extends Vehicle {
    }
    class Bike extends Vehicle {
    }

    Advantages
        Code Reusability
        Less Code Duplication
        Easier Maintenance
        Better Organization
        Supports Method Overriding
    Disadvantages
        Tight coupling between parent and child classes.
        Changes in the parent may affect child classes.
        Deep inheritance hierarchies can become difficult to maintain.
    Applications
        Used in:
            Banking Systems
            Employee Management
            Hospital Software
            E-commerce
            Android Apps
            Game Development

    # Types of Inheritance :
    1) Single Inheritance -> One parent class and one child class.
             Animal
               |
              Dog
    2) Multilevel Inheritance -> GrandParent -> Parent -> Child
            Animal
               |
             Dog
               |
             Puppy
    3) Hierarchical Inheritance -> One parent class and multiple child classes.
                Animal
              /    |    \
            Dog   Cat   Lion
*/