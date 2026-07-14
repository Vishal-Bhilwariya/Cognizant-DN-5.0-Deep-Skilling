/*

    # What is a Proxy?
    - A Proxy is an object that acts as a middleman between the client and the real object.

     Normally,
        User
         ↓
        BankService
     The user directly calls the method.

    With Spring AOP,
        User
          ↓
        Proxy
         ↓
        BankService

        The Proxy intercepts the method call.

        It can:
            Perform Logging
            Check Security
            Measure Time

        Then call the original method.

    Why Do We Need a Proxy?
    Suppose you have:
        transferMoney()

    You never wrote:
        logging();

        Yet Logging happens.

        How?
        Because Spring creates:
            Proxy
              ↓
            transferMoney()

        The Proxy adds Logging automatically before calling the real method.
    
    Real-Life Analogy
    - Imagine a company.
      Visitors never enter the CEO's office directly.
        They first meet the receptionist.
                Visitor
                   ↓
                Receptionist
                   ↓
                 CEO

        The receptionist:
            Checks identity
            Records visitor details
            Gives permission

        Only then can the visitor meet the CEO.

        Mapping
        Real Life	    Spring
        Visitor	        Client
        Receptionist	Proxy
        CEO	            Target Object
        Identity Check	Advice

    What Does the Proxy Do?
     When the client calls: transferMoney();
     The Proxy performs:
        Logging
            ↓
        Security
            ↓
        Business Method
            ↓
        Return Result

        Everything happens automatically.

    Advantages
     Business classes remain clean.
     Advice is added without modifying original code.
     Easy to add Logging, Security, Transactions.
     Flexible and reusable.
*/