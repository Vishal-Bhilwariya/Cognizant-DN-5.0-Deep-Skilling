/*

    # What are Query Methods?
    -  A Query Method is a repository method whose name itself tells Spring Data JPA what query to generate.
        Instead of writing SQL manually, Spring reads the method name and creates the required query automatically.

     Query Method = A repository method whose name is converted into a database query by Spring Data JPA.

    # Why Do We Need Query Methods?
     - Suppose you want to find an employee by name.
        Traditional Approach
            SELECT *
            FROM employee
            WHERE name='Rahul';
         You have to write SQL manually.

        With Spring Data JPA
            findByName(String name)
         Spring automatically generates the query.

    Benefits:
        Less code
        Easy to read
        No manual SQL
        Faster development

    # Query Method Naming Convention
        A query method follows this structure:

        Prefix + By + FieldName + Condition
        Example : findByName

        Breakdown:
              find
               │
               ▼
               By
               │
               ▼
             Name
    
    # Common Query Method Prefixes
        Prefix	    Purpose	                            Example
        findBy	    Retrieve data	                findByName()
        readBy	    Retrieve data	                readByEmail()
        getBy	    Retrieve one or more records	getByDepartment()
        existsBy	Check existence	                existsByEmail()
        countBy	    Count records	                countByDepartment()
        deleteBy	Delete records	                deleteById()

    # Common Keywords Used in Query Methods
     - Spring Data JPA understands many keywords.

        Keyword	        SQL Equivalent	        Example
        And	                AND	             findByNameAndSalary()
        Or	                OR	             findByNameOrDepartment()
        Between	           BETWEEN	         findBySalaryBetween()
        LessThan	            <	         findByAgeLessThan()
        GreaterThan	            >	         findBySalaryGreaterThan()
        Like	               LIKE          findByNameLike()
        Containing	        LIKE %value%	 findByNameContaining()
        StartingWith	    LIKE value%	     findByNameStartingWith()
        EndingWith	        LIKE %value	     findByNameEndingWith()
        OrderBy	            ORDER BY	     findByAgeOrderByNameAsc()
        In	                IN	             findByDepartmentIn()
        Not	                NOT          	 findByNameNot()
        IsNull	            IS NULL     	 findByEmailIsNull()
        IsNotNull	        IS NOT NULL	     findByEmailIsNotNull()
        True	            = TRUE	         findByActiveTrue()
        False	            = FALSE     	 findByActiveFalse()

    Common Query Methods
        Query Method	               Generated SQL (Conceptually)
        findByName()	                    WHERE name=?
        findByDepartment()	                WHERE department=?
        findByAgeGreaterThan()	            WHERE age > ?
        findBySalaryBetween()	            WHERE salary BETWEEN ? AND ?
        findByNameContaining()	            WHERE name LIKE '%value%'
        findByNameStartingWith()           	WHERE name LIKE 'value%'
        findByNameEndingWith()	            WHERE name LIKE '%value'

    # What are Named Queries?
     - A Named Query is a query that is defined once with a name and can be reused multiple times.
        Instead of writing the same query repeatedly, we define it once.

    # Why Use Named Queries?
     - Suppose many parts of the application need:
        SELECT *
        FROM Employee
        WHERE department='IT'

     Instead of writing it multiple times,Define it once and reuse it.

    Benefits:
        Reusability
        Easy maintenance
        Centralized query definition

    # @NamedQuery
     - @NamedQuery defines one named query.
        General Syntax
            @NamedQuery(
                name = "...",
                query = "..."
            )
    Explanation
        Element	        Purpose
        name	    Unique query identifier
        query	    JPQL query

    # @NamedQueries
     - Used when an entity has multiple Named Queries.
        Instead of writing many @NamedQuery annotations separately,they are grouped together.

            @NamedQueries
                ↓
            Query 1
                ↓
            Query 2
                ↓
            Query 3

    # What are Dynamic Queries?
     - A Dynamic Query is a query whose search conditions change at runtime based on user input.

     Example:
        Search Employee by
            Name
            Salary
            Department
            City

        Any combination may be used.
        The query changes dynamically.

     Real-Life Example
        Amazon Search

        Sometimes you search by: Brand
        Sometimes by: Price
        Sometimes by:  Rating
        Sometimes by all three.

        The query changes depending on filters.
        That is a Dynamic Query.
*/