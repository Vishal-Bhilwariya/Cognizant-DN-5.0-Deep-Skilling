/*

    # What are Projections?
    - A Projection is a technique used to retrieve only the required fields from the database instead of fetching the complete Entity.

    Example
        Employee Table
            ID	Name	Salary	Department	Email
            101	Rahul	50000	IT	rahul@gmail.com

        Suppose you only need:
            Name
            Department

        Instead of retrieving all columns, Spring Data JPA retrieves only:
            Name	Department
            Rahul	IT

        This is called a Projection.

    # Types of Projections
     Spring Data JPA mainly supports:

            Projections
                 │
         ┌───────┴───────────┐
        Interface      Class (DTO)
        Projection     Projection

    # Interface-Based Projection : 
     - An Interface-based Projection uses a Java Interface to define only the fields that should be fetched.
     - The interface contains getter methods for the required fields.

     Example
        Suppose Employee has:
            ID
            Name
            Salary
            Department
            Email

        Projection Interface
            EmployeeView
                ↓
            getName()
            getDepartment()

        Result
            Only:
                Name
                Department
                are retrieved.

     Why Use Interface Projection?
        Simple
        Less coding
        Automatic implementation by Spring
        Best for read-only data

    # Class-Based Projection (DTO):
     - A class-based projection uses a DTO (Data Transfer Object) class to define the required fields.
     - The DTO class must have a constructor that matches the fields being projected.

     Example
        Employee DTO
            EmployeeDTO
                ↓
            EmployeeDTO(String name, String department)

        Query Method
            @Query("SELECT new com.example.EmployeeDTO(e.name, e.department) FROM Employee e")

        Result
            Only:
                Name
                Department
                are retrieved.

     Why Use Class Projection?
        More control over data
        Can perform operations on data
        Good for complex data transformations
        Can include computed fields
        Can be reused across services

    # Real-Life Analogy
     - Suppose your Aadhaar Card contains:
        Name
        DOB
        Address
        Mobile
        Aadhaar Number

     When registering for a college,the college only asks:
        Name
        Address
      You don't submit every detail.

     That is exactly what a Projection does.

    # Constructor Expressions
     A Constructor Expression creates a DTO directly from the query result.

     Instead of returning an Entity, Spring creates an object of the DTO.

     Why Needed?
        Suppose query returns:
            Name
            Salary

        Spring directly creates

        EmployeeDTO
            ↓
          Name
          Salary

        No complete Entity is created.

     Advantages
        Less memory
        Faster execution
        Better performance
        Clean architecture

    # What is @Value?
     - @Value allows creating calculated or custom values inside a Projection.
        It can evaluate expressions.

     Example concepts:
        Instead of returning: Rahul
        Projection can return: Employee : Rahul or combine multiple fields.
    
    Why Use @Value?
     Sometimes,the required data is not stored directly in the database.

     Example
        Database
            First Name: Rahul
            Last Name : Sharma

        Application needs
            Rahul Sharma

        @Value can combine values into a computed result.

    # Advantages
        Retrieves only required data.
        Improves application performance.
        Reduces memory consumption.
        Reduces database load.
        Faster query execution.
        Cleaner API responses.
        Better scalability.
*/