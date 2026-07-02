/*

# What Does "Control" Mean?
- This is where many beginners get confused.
- In Spring,
  Control simply means: Who is responsible for creating and managing objects?

- Without Spring,
  Who has the control?
    Developer
         │
    Creates Objects
    The developer has the control.

# What is Inversion?
 - The word Inversion means: Reverse

Example:
       Normally : A → B
       After inversion : B → A

# What is Inversion of Control (IoC)?
 Control = Responsibility
 Inversion = Reversed
- Inversion of Control (IoC) means: The control of creating and managing objects is reversed.
- In Spring, the control of creating and managing objects is given to the Spring Framework.
  (The responsibility of creating and managing objects is transferred from the programmer to the Spring Framework.)

 Without Spring 
    Developer
         │
    Creates Objects
    The developer has the control.
 With Spring
           Programmer
              │
        Writes Classes
              │
              ▼
            Spring
              │
        Creates Objects

# What is a Container? 
- A Container is a place where objects are stored and managed.
- In Spring, the Container is responsible for creating, managing, and destroying objects.
Spring Container -> Manager of Objects

# What is the IoC Container?
- The Spring IoC Container is responsible for:
        Creating objects
        Managing objects
        Providing objects
        Destroying objects when needed

Developer
      │
Writes Classes
      │
      ▼
+----------------------+
| Spring IoC Container |
|                      |
| Creates Objects      |
| Stores Objects       |
| Manages Objects      |
+----------------------+
         │
         ▼
     Application

Example :
    Without Spring:
        Imagine you own a company.
        Every employee comes to you and says: Hire me.

        You personally:
            Hire everyone
            Assign work
            Manage everyone
        Very difficult.

    Now imagine an HR Department.
        Employees report to HR.
        HR:
            Hires employees
            Manages employees
            Assigns employees

    You simply ask HR:
        I need a Java Developer.
        HR provides one.

- Mapping
    Real Life	       Spring
    HR Department	IoC Container
    Employee	    Object (Bean)
    Company Owner	Developer

# Advantages
    Automatic object creation
    Easier maintenance
    Reduced boilerplate code
    Better scalability
    Promotes loose coupling
    Simplifies testing
*/