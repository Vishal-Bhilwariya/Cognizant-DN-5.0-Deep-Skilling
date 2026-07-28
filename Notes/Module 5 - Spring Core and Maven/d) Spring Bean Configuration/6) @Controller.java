/*

    # What is @Controller?
    - @Controller is a Spring stereotype annotation used to mark a class that handles user requests.

     Imagine you're using an online shopping website.
        You click: Login or Buy Now

        Who receives that request?
         The Controller.

        The Controller does not:
            Calculate discounts ❌
            Save data to the database ❌

        Instead, it:
            Receives the request ✅
            Calls the Service layer ✅
            Returns the response ✅

# Diagram :
        User
          │
 HTTP Request
          │
          ▼
+----------------+
|  @Controller   |
+----------------+
          │
          ▼
+----------------+
|    @Service    |
+----------------+
          │
          ▼
+----------------+
|  @Repository   |
+----------------+
          │
          ▼
      Database
          ▲
          │
     HTTP Response
          │
          ▼
        User

    Advantages
        Separates request handling from business logic.
        Improves code organization.
        Easier testing.
        Supports MVC architecture.
        Makes applications easier to maintain.

*/