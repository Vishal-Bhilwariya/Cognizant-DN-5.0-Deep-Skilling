/*

    # Before We Begin
     - Every application performs four fundamental operations on data:
        Create new data
        Read existing data
        Update existing data
        Delete existing data

     These four operations are collectively known as CRUD Operations.

        Examples:
        Application	       CRUD Example
        Instagram	       Create Post, Read Feed, Update Caption, Delete Post
        Amazon	           Add Product, View Product, Update Price, Delete Product
        Banking	           Create Account, View Balance, Update Details, Close Account

        REST APIs use HTTP methods to perform these operations.

    # What are CRUD Operations? 
    CRUD stands for:
        Letter	Meaning
        C	Create
        R	Read
        U	Update
        D	Delete

    CRUD ↔ HTTP Mapping
        CRUD    Operation	HTTP Method	Purpose
        Create	POST    	Insert new resource
        Read	GET	        Retrieve resource
        Update	PUT/PATCH	Modify resource
        Delete	DELETE	    Remove resource

    # Utilizing HTTP Methods for CRUD :
     - We learned HTTP methods earlier.
     - Now let's understand them from an enterprise CRUD perspective.

     A. CREATE Operation -> Creates a new resource in the database.
         HTTP Method: POST
        Example: POST /api/users
                 Creates a new user

     B. READ Operation -> Retrieves data from the database.
        HTTP Method: GET
        Example: GET /api/users
                 Retrieves all users
                 GET /api/users/123
                 Retrieves user with ID 123

     C. UPDATE Operation -> Modifies existing data.
        HTTP Method: PUT or PATCH
        PUT: Replace entire resource
        PATCH: Partial update
        Example: PUT /api/users/123
                 Updates entire user with ID 123
                 PATCH /api/users/123
                 Partially updates user with ID 123

     D. DELETE Operation -> Removes data from the database.
        HTTP Method: DELETE
        Example: DELETE /api/users/123
                 Deletes user with ID 123

    # Validating Input Data using Annotations :
    - Validation ensures that incoming client data is correct, complete, and follows business rules before it is processed.
    
    Why do we need Validation?
     Suppose user sends
        {
        "name":"",
        "age":-5,
        "email":"abc"
        }

        Without validation
            ↓
        Invalid data reaches database.

        Validation prevents this.

    # Bean Validation :
    - Spring Boot uses Jakarta Bean Validation (formerly Java Bean Validation).
    - Validation annotations are placed on DTO or Entity fields
    - Common Annotations
        Annotation	    Description	                Purpose	                            Example
        @NotNull	    Value cannot be null	    Mandatory field	                    Name
        @NotBlank	    Cannot be null or blank	    Text input	                        Username
        @NotEmpty	    Cannot be empty	            Collections/Strings	                List
        @Size	        Length constraint	        Password length	                    @Size(min=8)
        @Min	        Minimum value	            Age, Salary	                        @Min(18)
        @Max	        Maximum value	            Marks	                            @Max(100)
        @Email	        Valid email format	        Email validation	                User email
        @Pattern	    Regular expression	        Phone,                              PAN	Regex
        @Positive	    Must be positive	        Price	                            Positive numbers
        @Past	        Date must be in past	    DOB	                                Birth date
        @Future	        Date must be future	        Appointment	                        Booking date
        @Valid	        Triggers validation	        Validate nested object/request body	@Valid @RequestBody

    # Example : 
        public class EmployeeDTO {
            @NotBlank          // Name cannot be blank
            private String name;

            @Email             // Must be a valid email
            private String email;

            @Min(18)           // Minimum allowed age
            private int age;
        }

    Using @Valid
        @PostMapping("/employees")
        public Employee createEmployee(
            @Valid                 // Triggers validation
            @RequestBody EmployeeDTO dto){
            return service.save(dto);
        }

    # Optimistic Locking for Concurrent Updates :
     - Optimistic Locking is a concurrency control mechanism that prevents users from accidentally overwriting each other's updates.
     - It assumes that conflicts are rare, so multiple users can read the same data. Before saving, the system checks whether the data has changed.

    Why do we need it?
    - Imagine two employees editing the same record.

     Without Optimistic Locking
        Database : Salary = 50000

        User A reads salary.
                ↓
        User B reads salary.
                ↓
        User A updates - 60000
                ↓
        User B updates - 55000

        Final database - 55000

        User A's changes are lost.
        This is called a Lost Update Problem.

     Solution
        Use a Version Number.
        Employee
        Salary = 50000
        Version = 1
        User A updates
            ↓
        Database
        Version = 2

        User B tries updating using Version 1
            ↓
        Rejected.

    @Version Annotation
     - Spring Data JPA provides the @Version annotation.
        When an entity has a version field:
            JPA automatically increments the version after every successful update.
            If another transaction tries to update an older version, an OptimisticLockException is thrown.
        
        Syntax
                @Version
                private Long version;
        
        Syntax Table
        Name        	Description 	        Purpose	                Example
        @Version	    Version field	Detect concurrent updates	private Long version;
        
        Example
            @Entity
            public class Employee {
                @Id
                private Long id;
                private String name;
                @Version             // Automatically managed by JPA
                private Long version;
            }


    Optimistic vs Pessimistic Locking
        Optimistic Locking	                Pessimistic Locking
        Assumes conflicts are rare	    Assumes conflicts are common
        No database lock while reading	Locks data immediately
        Better performance	            Lower concurrency
        Uses version numbers	        Uses database locks
        Preferred in web applications	Preferred in high-contention systems

    Advantages
        Standardized CRUD operations using HTTP.
        Clear mapping between SQL operations and REST endpoints.
        Strong input validation improves data integrity.
        Optimistic locking prevents lost updates.
        Better scalability and concurrency.
        Easier maintenance and testing.
        Enterprise-ready architecture.


     */