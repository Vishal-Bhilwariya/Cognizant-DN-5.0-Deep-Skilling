# Module 1 – Design Patterns and Principles

---

## 1) OOPs (Object-Oriented Programming)

| # | Topic | Description |
|---|-------|-------------|
| a | History of OOPs | Evolution: Machine Language → Assembly → Procedural → OOP. Why OOP was needed for large-scale applications. |
| b | Object & Class | Class as a blueprint, Object as an instance. Fields, Methods, Constructors (Default, Parameterized, Copy). |
| c | OOP vs Procedural Programming | Differences in approach, security, reusability, and maintainability. |
| d | Abstraction | Hide "How", Show "What". Achieved via abstract classes and interfaces. |
| e | Encapsulation | Wrapping data + methods into a single class. Private variables with Getters & Setters and data validation. |
| f | Inheritance | Parent-Child class relationship using `extends`. Types: Single, Multilevel, Hierarchical. |
| g | Polymorphism | Compile-time (Method Overloading) and Runtime (Method Overriding). |
| h | Access Modifiers | `private`, `default`, `protected`, `public` — access level comparison. |
| i | Difference Between the Four Pillars of OOP | Comparison table: Encapsulation, Inheritance, Polymorphism, Abstraction. |

---

## 2) SOLID Principles

| # | Topic | Description |
|---|-------|-------------|
| a | UML Diagrams | UML as a software blueprint. Two types — Structural (Class, Object, Component, Deployment, Package) and Behavioral (Use Case, Sequence, Activity, State Machine). Class Diagram syntax with access symbols (+, -, #, ~). Associations: Class Association (Inheritance/IS-A), Object Association — Simple Association, Aggregation (Weak HAS-A), Composition (Strong HAS-A). |
| b | Introduction to SOLID | Problems without design principles: Code Duplication, Tight Coupling, Low Reusability, Difficult Maintenance, Testing, and Extension. Why SOLID was introduced. SOLID map: SRP → OCP → LSP → ISP → DIP. |
| c | Single Responsibility Principle (SRP) | One Class = One Responsibility = One Reason to Change. Splits large classes into focused ones (SalaryService, DatabaseService, EmailService, ReportService). Advantages: Easy Maintenance, Debugging, Testing, Less Coupling. |
| d | Open/Closed Principle (OCP) | Open for Extension, Closed for Modification. Add new code without touching existing tested code. Analogy: installing an app doesn't modify Android's source code. |
| e | Liskov Substitution Principle (LSP) | Child class should be a valid substitute for its parent class. Formula: Child Class = Valid Substitute for Parent Class. Counter-example: Penguin cannot fly, so it violates LSP if it inherits a Bird class with `fly()`. |
| f | Interface Segregation Principle (ISP) | A class should not be forced to implement methods it doesn't need. Split large interfaces into smaller, specific ones. Example: Robot shouldn't implement `eat()` or `sleep()` from a Worker interface. |
| g | Dependency Inversion Principle (DIP) | High-level modules should not depend on low-level modules. Both should depend on abstractions (interfaces). Formula: Class → Interface ← Class. Example: Notification depends on MessageService interface, not directly on EmailService or SMSService. |
| h | Dependency Injection (DI) | Technique to implement DIP — inject dependencies from outside instead of creating them inside the class. Types: Constructor Injection, Setter Injection, Field Injection (`@Autowired`). |

---

## 3) Commonly Used Design Patterns

### a) Introduction

| Topic | Description |
|-------|-------------|
| Design Principles vs Design Patterns | Principles = Rules & Guidelines (SOLID). Patterns = Ready-made Solutions (Singleton, Factory). Together: Good Principles + Good Patterns = Good Software Design. |

---

### b) Creational Patterns

| # | Pattern | Description |
|---|---------|-------------|
| 1 | Singleton Pattern | Ensures only one object of a class is created throughout the application. Private constructor + static `getInstance()` method. Example: Printer in an office — everyone shares one printer instance. |
| 2 | Factory Method Pattern | Creates objects without specifying their exact class. Client asks Factory, Factory decides which object to create. Supports OCP — adding new types doesn't change client code. Example: `VehicleFactory.getVehicle("Car")`. |
| 3 | Builder Pattern | Constructs complex objects step by step using a Builder class instead of a large constructor. Supports optional parameters. Example: `new StudentBuilder().setName("Vishal").setAge(20).setCity("Agra").build()`. |

---

### c) Structural Design Patterns

| # | Pattern | Description |
|---|---------|-------------|
| 1 | Adapter Pattern | Allows two incompatible interfaces to work together by acting as a bridge. Example: Adapting OldPaymentGateway to work with PaymentInterface without modifying either. Supports OCP. |
| 2 | Decorator Pattern | Adds new functionality to an existing object without changing its class. Example: Decorating a Coffee object with Milk, Sugar, Chocolate dynamically. Supports OCP. |
| 3 | Proxy Pattern | Provides a substitute object that controls access to the real object. Types: Virtual Proxy (Lazy Loading), Protection Proxy (Access Control), Remote Proxy, Caching Proxy. Formula: Client → Proxy → Real Object. |

---

### d) Behavioral Patterns

| # | Pattern | Description |
|---|---------|-------------|
| 1 | Observer Pattern | One-to-many relationship — Subject automatically notifies all Observers on state change. Example: YouTube channel notifying all subscribers on new video upload. Methods: `attach()`, `detach()`, `notify()`. |
| 2 | Strategy Pattern | Defines a family of algorithms, puts each in a separate class, and allows switching at runtime. Eliminates if-else chains. Example: Payment system with UPI, Card, NetBanking as interchangeable strategies. |
| 3 | Command Pattern | Encapsulates a request as an object, decoupling sender from receiver. Supports Undo/Redo, logging, and queuing. Example: TV Remote (Invoker) → PowerCommand → TV (Receiver). |

---

### e) Architectural Patterns

| # | Pattern | Description |
|---|---------|-------------|
| 1 | Model-View-Controller (MVC) | Separates application into Model (data & business logic), View (UI display), Controller (handles requests, bridges Model & View). Supports team development — frontend and backend can work independently. |
| 2 | Dependency Injection (DI) | Dependencies are provided from outside instead of being created inside the class. Types: Constructor Injection, Setter Injection, Field Injection. Implements DIP, promotes loose coupling and testability. |

---

## Interview Questions
- Design Patterns & Principles related Q&A
