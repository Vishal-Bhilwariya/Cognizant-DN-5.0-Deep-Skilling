/*

    # Exception Handling :
    - Exception Handling is the process of catching and handling runtime errors so that the application continues to work properly.

    Suppose your application tries to divide:
        int result = 10 / 0;

        Java throws: ArithmeticException

        Without Exception Handling
            Application
                ↓
            Crash 

        With Exception Handling
            Application
                ↓
            Exception Handled
                ↓
            Friendly Error Page 

    Common Exceptions
        Exception	            Meaning
        ArithmeticException	    Divide by zero
        NullPointerException	Using a null object
        NumberFormatException	Invalid number conversion
        FileNotFoundException	File not found
        SQLException	        Database error

    What is @ExceptionHandler?
    - @ExceptionHandler is used to handle specific exceptions inside a Controller.

    Syntax : 
        @ExceptionHandler(ArithmeticException.class)
        public String handleException(){
            return "error";
        }

    Example : 
            import org.springframework.stereotype.Controller;
            import org.springframework.web.bind.annotation.*;
            @Controller
            public class StudentController {
                @GetMapping("/divide")
                public String divide() {
                    int result = 10 / 0; // Exception occurs
                    return "success";
                }
                // Handles ArithmeticException only for this Controller
                @ExceptionHandler(ArithmeticException.class)
                public String handleArithmeticException() {
                    return "error";
                }
            }
            
    What is @ControllerAdvice?
    - Suppose you have:
        StudentController
        EmployeeController
        ProductController
        LoginController

     Do you write the same Exception Handler in every Controller?
     No.

     Spring provides:
        @ControllerAdvice
        It creates one global exception handler.

    Example : 
        import org.springframework.web.bind.annotation.ControllerAdvice;
        import org.springframework.web.bind.annotation.ExceptionHandler;
        @ControllerAdvice
        public class GlobalExceptionHandler {
            @ExceptionHandler(Exception.class)
            public String handleException() {
                return "error";
            }
        }

        @ExceptionHandler vs @ControllerAdvice
        @ExceptionHandler	                        @ControllerAdvice
        Handles exceptions inside one Controller	Handles exceptions for all Controllers
        Local exception handling	                Global exception handling
        Less reusable	                            Highly reusable

    Advantages
         Prevents application crashes.
         Provides user-friendly error messages.
         Centralized error handling.
         Improves application reliability.
         Better user experience.
*/