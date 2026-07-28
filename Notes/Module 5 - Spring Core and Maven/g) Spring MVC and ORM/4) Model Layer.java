/*

    # What is the Model Layer?
    - The Model Layer is responsible for holding and transferring data from the Controller to the View.

    Why Do We Need the Model?
     Suppose the Controller has:
        Student Name = Vishal
        Age = 20
        Branch = CSE

     Without the Model:
        The View cannot access this data.
        The webpage would be empty.
        The Model transfers the data to the View.

    # Spring Model - Spring provides the Model interface.
        Syntax: public String home(Model model)
    
    # Adding Data to Model - model.addAttribute("name", "Vishal");

    Example : 
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        @Controller
        public class StudentController {
            @GetMapping("/student")
            public String showStudent(Model model) {
                // Add data to the Model
                model.addAttribute("name", "Vishal");
                model.addAttribute("branch", "CSE");

                // Return logical View name
                return "student";

            }
        }

    Advantages
        Clean separation between Controller and View.
        Easy way to pass multiple data values.
        Supports reusable Views.
        Makes Controllers cleaner.
*/