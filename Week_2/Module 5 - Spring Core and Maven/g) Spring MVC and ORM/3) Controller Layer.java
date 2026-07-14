/*

    # What is a Controller?
     - A Controller is a Spring MVC component that receives HTTP requests, processes them, communicates with the Model/Service layer, and returns a View or Response.

     Suppose a user visits: http://localhost:8080/student
        The browser sends a request.
            Who receives it?

        Not the database.
        Not the Model.

        The Controller receives it first (through the DispatcherServlet).

    # @Controller
        @Controller tells Spring: "This class handles web requests."

     Syntax
        @Controller
        public class StudentController {

        }

    a) @RequestMapping-@RequestMapping maps a URL to a Controller or a specific method.
     Example
        @Controller
        @RequestMapping("/student")
        public class StudentController {

        }
     Now every request beginning with: /student  goes to this Controller.

     Method-Level Mapping
        @RequestMapping("/list")
        public String showStudents() {
            return "students";
        }

     Complete URL: student/list
    
    b) @GetMapping - Handles HTTP GET requests.
        GET is used to:
            View pages
            Retrieve data
        Example
            @GetMapping("/students")
            public String showStudents() {
                return "students";
            }

        When the browser requests: GET /students

        Spring calls this method.

    c) @PostMapping-Handles HTTP POST requests.

        POST is used to:
            Submit forms
            Save data
            Insert records
        Example
        @PostMapping("/save")
        public String saveStudent() {
            return "success";
        }
        When a form is submitted: POST /save

        this method executes.

    Example :
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
    @Controller // Registers this class as a Controller
    public class StudentController {
        // Handles GET request: /students
        @GetMapping("/students")
        public String showStudents() {
            // Returns the logical View name
            return "students";
        }
    }

    Advantages
        Separates request handling from business logic.
        Clean and organized architecture.
        Easy URL management.
        Supports REST and web applications.
        Easy integration with Spring Boot.
    */