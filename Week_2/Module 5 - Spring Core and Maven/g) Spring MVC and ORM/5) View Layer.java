/*

    # What is View Layer ?
    - The View Layer is responsible for displaying data to the user.

        Suppose a user searches for student details.
        The Controller gets the student information.
        The Model stores it.
        Now someone has to display it.
        That responsibility belongs to the View.
        
    Why do we need View?
     Suppose a Controller returns:
        Name = Vishal
        Branch = CSE

     Without a View,
        the browser cannot display this information properly.
        The user would only have raw data.

     With a View,
        the same information appears as a proper webpage.
        
    
    # View Technologies
     Spring MVC supports many View technologies.
    a) JSP ( Older Spring MVC applications. )
        Example : student.jsp
    
    b) Thymeleaf ( Modern Spring Boot applications. )
        Example: student.html
        
        HTML Used with React, Angular and Vue.

    Example :
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    @Controller
    public class StudentController {
        @GetMapping("/student")
        public String showStudent(Model model) {
            // Add data to Model
            model.addAttribute("name", "Vishal");
            model.addAttribute("branch", "CSE");

            // Return View Name
            return "student";
        }
    }


    View (student.jsp)
        Student Name : ${name}
        Branch : ${branch}

        Don't worry about ${name} syntax now. We'll study JSP/Expression Language in advanced topics. For now, just know that it displays data from the Model.

    Output
        Student Details
        Name : Vishal
        Branch : CSE

    # Advantages
        Separates UI from business logic.
        Easy to change webpage design.
        Supports multiple View technologies.
        Better code organization.
        Reusable pages.
    */