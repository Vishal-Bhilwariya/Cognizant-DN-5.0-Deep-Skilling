/*

    # Form Handling :
    - Form Handling is the process of receiving user input from an HTML form, processing it in the Controller, and returning a response.

    Suppose a student fills a registration form.
        Name : Vishal
        Age : 20
        Branch : CSE

     After clicking Submit,
        the data goes to the Spring Controller.
        The Controller processes it and stores it.
        This complete process is called Form Handling.

    Why do we need Form Handling?
    - Every website needs user input.

    Examples:
        Login
        Registration
        Contact Us
        Feedback
        Payment
        Booking Ticket

    Without Form Handling,users cannot send data to the server.

    # GET vs POST in Form Handling
    a) GET Request
        Used to display the form.
        Example
            @GetMapping("/register")
            public String showForm(){

                return "register";

            }
    b) POST Request
        Used to submit the form.
        Example
            @PostMapping("/register")
            public String submitForm(){
                return "success";
            }

Advantages
    Automatic form data binding.
    Less boilerplate code.
    Easy integration with Spring MVC.
    Clean Controller methods.
    Supports complex Java objects.



            */