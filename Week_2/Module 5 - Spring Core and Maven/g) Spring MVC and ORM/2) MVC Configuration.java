/*

    # What is MVC Configuration?
    - MVC Configuration is the process of setting up Spring MVC so it can receive requests, process them, and return responses.

      Imagine you build a website.
        Without configuration:

            User
             ↓
         Spring doesn't know
            Which Controller?
            Which View?
            Which URL?

        So we configure Spring MVC to answer questions like:
             Which class handles requests?
             Which Controller should be called?
             Which View should be displayed?
             Where are the JSP/HTML pages?

    Advantages
        Centralized request handling.
        Easy URL mapping.
        Clean architecture.
        Automatic Controller discovery.
        Easy View management.
*/