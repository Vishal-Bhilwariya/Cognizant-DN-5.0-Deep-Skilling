/*

    # What is CRUD?
     - CRUD stands for the four basic operations performed on data stored in a database.
        Letter	    Full Form	    Purpose
        C	        Create	    Insert new data
        R	        Read	    Retrieve existing data
        U	        Update	    Modify existing data
        D	        Delete	    Remove existing data

        Almost every application (Banking, E-Commerce, Hospital, Social Media) performs these four operations.

    # Why Do We Need CRUD Operations?
        Imagine an Employee Management System.
        You should be able to:
            Add a new employee.
            View employee details.
            Update employee salary.
            Delete an employee.
        Without CRUD, data cannot be managed.

    CRUD Operations Flow
    Create  → INSERT
    Read    → SELECT
    Update  → UPDATE
    Delete  → DELETE

    # Create Operation (save())
        The Create operation inserts a new record into the database.
        Spring Data JPA provides: save(entity)

    # Read Operation
     - Read operations retrieve data from the database.
        Common methods:
            Method	            Purpose                                  Equivalent to sql
            findAll()	    Retrieve all records                    SELECT * FROM employee; 
            findById()	    Retrieve one record by Primary Key      SELECT * FROM employee WHERE id=?
            existsById()	Check if record exists                  SELECT EXISTS(...)
            count()	        Count total records                     SELECT COUNT(*) FROM employee

    # Update Operation (save())
     - Updates an existing record.
        Interestingly, Spring Data JPA uses the same save() method for both Insert and Update.

        How Does It Decide?
            If the Primary Key exists:
                Existing ID
                    ↓
                UPDATE

            If the Primary Key does not exist:
                New ID
                    ↓
                INSERT

    # Delete Operation
        Common methods:

        Method          	Purpose                         Equivalent SQL
        delete()	    Delete an entity                
        deleteById()	Delete using Primary Key        DELETE FROM employee WHERE id=?
        deleteAll()	    Delete all records              DELETE FROM employee;


    # Common JpaRepository Methods
        Method	        CRUD Operation	         Return Type	Purpose
        save()	        Create / Update	            Entity	    Insert or Update
        saveAll()	    Create / Update	            List	    Save multiple records
        findAll()	    Read	                    List	    Retrieve all records
        findById()	    Read	                    Optional	Retrieve by Primary Key
        existsById()	Read	                    boolean	    Check existence
        count()	Read	long	                                Count records
        delete()	    Delete	                    void	    Delete an entity
        deleteById()	Delete	                    void	    Delete by Primary Key
        deleteAll()	    Delete	                    void	    Delete all records

    What is Optional?
        findById() returns an Optional.
        Why?
        Sometimes the requested record does not exist.
        Instead of returning null, Spring returns an Optional.
      Benefits:
        Avoids NullPointerException
        Safer code
        Encourages explicit handling of missing values

    # Executing Custom Queries
        Sometimes built-in CRUD methods are not enough.

        Example requirements:
            Employees with salary > 50,000
            Employees hired this year
            Top 5 highest salaries

        These require Custom Queries.

        Methods used:
            Derived Query Methods
            @Query

        Example: findByDepartment(String department)
                        or
                @Query(...)

        These allow searching beyond basic CRUD.

    # Real-Life Analogy
        Think of an ATM.

        Operation   	ATM Example
        Create	    Open new account
        Read	    Check balance
        Update	    Change mobile number
        Delete	    Close account

        Every management system follows CRUD.
*/