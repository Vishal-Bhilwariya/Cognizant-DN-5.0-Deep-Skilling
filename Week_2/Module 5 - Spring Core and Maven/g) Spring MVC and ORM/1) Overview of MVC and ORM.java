/*

    # What is MVC?
    -  MVC (Model-View-Controller) is a software design pattern that separates an application into three independent components:
        Model
        View
        Controller
        Beginner-Friendly Explanation

       Imagine you're using an Amazon shopping website.
        When you click "Search Product", many things happen.

     Instead of writing everything in one class, Spring divides the work.
        User
         ↓
        Controller
         ↓
        Model
         ↓
        Database
         ↓
        View
         ↓
        User

        Each layer has a different responsibility.

    Components of MVC
     a) Model
        Responsible for
            Data
            Business Logic
            Database communication

        Example:
            Student
            Employee
            Product

     b) View
         Responsible for Showing information to the user.

        Example
            Login Page
            Home Page
            Student List
            
     c) Controller
        Responsible for
            Receiving requests
            Calling Model
            Returning View

        Example
            LoginController
            StudentController
            ProductController
    Advantages of MVC
        Better code organization
        Easy maintenance
        Easier debugging
        Reusable code
        Team members can work independently
        Clear separation of responsibilities

    What is ORM?
    - ORM (Object Relational Mapping) is a technique that maps Java Objects to Database Tables.

    Normally,
    Java understands Student student;
    Database understands STUDENT TABLE

    ORM connects both.

    # Why Do We Need ORM?
     Without ORM
        Developer writes SQL manually.

        INSERT INTO STUDENT...
        UPDATE STUDENT...
        DELETE...
        SELECT...

        For every operation.

     With ORM
        Simply write

        studentRepository.save(student);

        ORM automatically generates SQL.

    # What is Hibernate?
    - Hibernate is the most popular ORM framework for Java.
    - Spring ORM often works with Hibernate.

        Spring
         ↓ 
        Hibernate
         ↓
        Database
        
*/