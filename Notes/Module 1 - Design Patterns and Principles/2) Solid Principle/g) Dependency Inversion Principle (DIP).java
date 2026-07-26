/*
    # D — Dependency Inversion Principle (DIP). :
    -High-level modules should not depend on low-level modules. Both should depend on abstractions (interfaces or abstract classes)

    Instead of one class directly depending on another concrete class, both should depend on an interface or abstract class.
    Formula : Class → Interface ← Class
    Instead of: Class A → Class B
    Use: Class A → Interface ← Class B

    Why Do We Need DIP?
    Suppose you build a Notification System.
        Initially, it only sends emails.
            Notification
                ↓
            Email Service
        Later, the client asks for:
            SMS
            WhatsApp
            Push Notification

        Without DIP, you modify the Notification class every time.
        This increases coupling.

    Problem Without DIP
        Notification
            ↓
        EmailService

        Tomorrow:
            Notification
                ↓
            SMSService
        Again, modify Notification.

        Next:
            Notification
                ↓
            WhatsAppService

        Again,modify Notification.

        This violates DIP.

    Without DIP :
        +------------------+
        | Notification     |
        +------------------+
                 |
                 ▼
        +------------------+
        | EmailService     |
        +------------------+
    Notification is tightly coupled with EmailService.

    With DIP :
                    +----------------------+
                   | MessageService       |
                   | (Interface)          |
                   +----------------------+
                         ▲        ▲
                         |        |
                +--------+        +--------+
                |                          |
        +------------------+      +------------------+
        | EmailService     |      | SMSService       |
        +------------------+      +------------------+

                         ▲
                         |
                 +------------------+
                 | Notification     |
                 +------------------+
        Notification depends only on the interface.

    Advantages
        Low Coupling
        Easy to extend
        Easy to test
        Better flexibility
        Better maintainability
        Supports OCP
    Disadvantages
        More interfaces/classes.
        Slightly more complex for small projects.
*/