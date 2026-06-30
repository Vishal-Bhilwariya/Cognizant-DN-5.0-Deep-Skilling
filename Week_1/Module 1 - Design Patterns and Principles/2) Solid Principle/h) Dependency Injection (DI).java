/*

# Dependency Injection (DI) :
 - Dependency Injection (DI) is a technique in which an object receives its required dependency from outside, instead of creating it itself

  DI means providing an object (dependency) from outside instead of creating it inside the class.

    # How DI Helps in DIP
        DIP says (Principle)
            Depend on abstractions (interfaces), not concrete classes.

        DI does (Technique)
            It injects the required implementation into the class.

            DIP (Principle)
                │
                ▼
            Notification
                │
            MessageService (Interface)
                ▲
                │
            EmailService / SMSService
                ▲
                │
            DI injects this object

        So:
            DIP tells you what design to follow.
            DI is how you implement that design.
*/