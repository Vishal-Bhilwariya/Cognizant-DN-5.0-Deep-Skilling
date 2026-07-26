/*

#  Adapter Pattern : 
- Adapter Pattern allows two incompatible interfaces to work together by acting as a bridge (adapter) between them.
 Suppose you have:
    A mobile charger
    A wall socket
    But the charger plug doesn't fit the socket.
    You use an Adapter.
    The adapter connects both devices.
    The same idea is used in software

    # Why Do We Need Adapter Pattern?
     Imagine your application only understands:
        USB-C Charger
            But a customer brings:
            Micro USB Charger
        Without an adapter,they cannot connect.

     Instead of changing the charger or the phone,
        we use an adapter.

    Software Problem
        Suppose your application accepts:
            PaymentInterface
        But a third-party payment gateway provides:
            OldPaymentGateway
        Their methods are different.

        Instead of changing the third-party library,
        we create an Adapter.

    Advantages
        Reuses existing classes.
        No need to modify old code.
        Supports Open/Closed Principle.
        Reduces compatibility issues.
        Integrates third-party libraries easily.
    Disadvantages
        Adds an extra class.
        Slightly increases complexity.
        Too many adapters can make the design harder to understand.
*/