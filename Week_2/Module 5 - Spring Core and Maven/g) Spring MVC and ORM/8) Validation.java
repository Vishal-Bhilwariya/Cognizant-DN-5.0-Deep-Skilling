/*

    # Validation : 
    - Validation is the process of checking whether user input satisfies the required rules before processing or storing it.

    Suppose a registration form asks for:
        Name
        Email
        Age

    User enters:
        Name : ""
        Email : abc
        Age : -5

    Should Spring save this?
    No.

    Spring first validates the data.
    If the data is invalid, error messages are shown.
    If the data is valid, it is saved.

    Real-Life Analogy
     Imagine taking an exam.
        Before entering the exam hall, the invigilator checks:
            Admit Card ✅
            ID Card ✅
            Signature ✅

        If everything is correct, you enter.
        Otherwise, you are stopped.

        Mapping
        Real Life	 Spring MVC
        Student	        User
        Invigilator	    Validation
        Admit Card Check	Validation Rules
        Exam Hall	    Database

    Common Validation Annotations
    - These are the annotations most commonly used in Spring (Jakarta Bean Validation).

        Annotation	        Purpose	                                Example
        @NotNull	        Value must not be null	                Name required
        @NotBlank	        String must not be empty or whitespace	" " 
        @NotEmpty	        Collection/String must not be empty	    "" 
        @Size(min,max)  	Checks string length	                Username 3–20 chars
        @Min(value)	        Minimum numeric value	                Age ≥ 18
        @Max(value)	        Maximum numeric value	                Marks ≤ 100
        @Email	            Valid email format	                    abc@gmail.com
        @Pattern	        Matches a regular expression	        Phone number

    Example : 
        import jakarta.validation.constraints.*;
        public class Student {
            @NotBlank(message = "Name is required")
            private String name;
            @Email(message = "Invalid Email")
            private String email;
            @Min(value = 18, message = "Age must be at least 18")
            private int age;
            // Getters and Setters
        }

    # Using @Valid
    - @Valid tells Spring:"Validate this object before processing it."

    Example:
        @PostMapping("/register")
        public String saveStudent(
                @Valid @ModelAttribute Student student,
                BindingResult result) {
            if(result.hasErrors()){
                return "register";
            }
            return "success";
        }
    
    Advantages
        Prevents invalid data.
        Improves application security.
        Better user experience.
        Easy integration with Spring MVC.
        Reduces database errors.
*/