/*

# @Service Annotation

 # What is @Service?
- @Service is a Spring stereotype annotation used to mark a class as a Service Bean.
  It tells Spring: "This class contains business logic."

Suppose you're building an Online Shopping Application.
You have a class:
    public class OrderService {

    }

This class contains logic like:
    Calculate total price
    Apply discount
    Validate payment
    Generate invoice

These operations are business logic.

So we write:
    @Service
    public class OrderService {

    }

Now Spring knows: This class belongs to the Service Layer and should be managed as a Bean.

# What is Business Logic?
- Business logic is the part of the application that handles the core functionality and rules of the business domain.
- It defines how data is created, stored, and changed.
- Business Logic is the set of rules that determine how an application works.

    Examples : Banking App 
                Business Logic:
                            Transfer money
                            Check balance
                            Calculate interest
                            Validate account

    Real-Life Analogy

     Imagine ordering food.
            Customer
                  │
                  ▼
            Waiter
                  │
                  ▼
            Chef
                  │
                  ▼
            Kitchen

        Mapping:
            Real Life	Spring
            Customer	User
            Waiter	    @Controller
            Chef	    @Service
            Kitchen	    @Repository

            The Chef does the actual cooking.

        Similarly,  Service performs the application's actual work.

Syntax :
    @Service
    public class StudentService {

    }

Advantages
    Clearly identifies the business layer.
    Improves project readability.
    Better separation of concerns.
    Easy to maintain.
    Widely used in enterprise applications.
*/