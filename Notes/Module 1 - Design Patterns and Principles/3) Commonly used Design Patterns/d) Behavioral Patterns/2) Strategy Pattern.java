/*

 # Strategy Pattern :
 - Strategy Pattern defines a family of algorithms, puts each algorithm into a separate class, and allows them to be used interchangeably at runtime.
 
 Imagine you are using Google Maps.
    To reach a destination, you can choose:
        Car
        Walk
        Bicycle
        Bus
    The destination is the same, but the strategy (way of traveling) changes.
    You can switch the strategy anytime without changing Google Maps.

Suppose you have a Payment System.
    Without Strategy Pattern:
        if(paymentType.equals("UPI")) {
            // UPI Payment
        }
        else if(paymentType.equals("Card")) {
            // Card Payment
        }
        else if(paymentType.equals("NetBanking")) {
            // Net Banking
        }
    Problems:
        Large if-else blocks.
        Hard to maintain.
        Difficult to add new payment methods.
        Violates Open/Closed Principle (OCP).
    Solution
        Create separate classes:
        Payment Strategy 
            ↓
        UPI Payment
        Card Payment
        Net Banking Payment

        At runtime, choose whichever strategy you want.

             PaymentStrategy
                     ▲
         -------------------------
         |           |           |
       UPI        Card     NetBanking

                     ▲
                     |
                  PaymentApp

Advantages
    Eliminates long if-else or switch statements.
    Easy to add new algorithms.
    Supports Open/Closed Principle.
    Promotes code reuse.
    Easy to test each strategy independently.
Disadvantages
    Increases the number of classes.
    The client must know which strategy to choose.
*/