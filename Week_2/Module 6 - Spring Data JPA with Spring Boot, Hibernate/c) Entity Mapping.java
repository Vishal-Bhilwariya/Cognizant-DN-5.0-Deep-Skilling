/*

    # What is Entity Mapping?
     - Entity Mapping is the process of connecting a Java Class with a Database Table.
        It tells JPA:
            Which class represents a table.
            Which variables represent columns.
            Which field is the primary key.
            How Java objects should be stored in the database.

        In simple words,Entity Mapping = Mapping Java Objects to Database Tables using annotations.

    # Why Do We Need Entity Mapping?
     - A database understands:
        Tables
        Rows
        Columns

     - Java understands:
        Classes
        Objects
        Variables

     They speak different "languages."
     Entity Mapping acts as a translator between them.

    What is an Entity?
     - An Entity is a Java class that represents a table in the database.
     - Each object of the entity represents one row of the table.

    Example
     Database Table
        Employee_ID	    Name	    Salary
        101	            Rahul   	50000
        102	            Amit	    60000

        Equivalent Java Class : Employee employee = new Employee();
        One object = One row.

    Important JPA Annotations
        Annotation	            Purpose
        @Entity	            Marks a class as a JPA Entity
        @Table	            Maps entity to a specific table
        @Id	                Declares Primary Key
        @GeneratedValue	    Automatically generates Primary Key
        @Column	            Maps field to a column
        @Transient	        Field is not stored in database
        @Temporal (Legacy)	Maps Date/Time types (mainly with java.util.Date)
        @Enumerated	        Stores Enum values

    1) @Entity -> Marks a class as a JPA Entity
    - Every Entity class must be annotated with @Entity.
    - It tells JPA that this class represents a database table.

    Example:
        @Entity
        public class Employee {
            // ...
        }

    2) @Table -> Maps entity to a specific table
    - If not specified, the class name is used as the table name.
    - Use @Table to specify a custom table name.

    Example:
        @Entity
        @Table(name = "emp")
        public class Employee {
            // ...
        }

    3) @Id -> Declares Primary Key
    - Every Entity must have one @Id field.
    - It represents the unique identifier for each row.

    Example:
        @Entity
        public class Employee {
            @Id
            private Long id;
            // ...
        }
    What is Primary Key?
    - A Primary Key uniquely identifies every row.
        Example
            ID	Name
            1	Rahul
            2	Amit
        No two rows can have the same ID.

     Characteristics of Primary Key
        Unique
        Cannot be NULL
        Identifies one record
        One per table (simple primary key)

    4) @GeneratedValue -> Automatically generates Primary Key
    - Specifies how the primary key value is generated.
    - Common strategies:
        AUTO: Let the persistence provider decide
        IDENTITY: Dasabase handles auto-increment
        SEQUENCE: Uses database sequence
        TABLE: Uses a separate table for IDs

    Example:
        @Entity
        public class Employee {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;
            // ...
        }

    5) @Column -> Maps field to a column
    - Maps a field to a specific column in the table.
    - Useful when field name differs from column name.

    Example:
        @Entity
        public class Employee {
            @Id
            private Long id;

            @Column(name = "employee_name")
            private String name;

            @Column(name = "salary")
            private Double salary;
            // ...
        }
    Useful attributes:
        Attribute	    Purpose
        name	    Column name
        nullable	Allow NULL values or not
        unique	    Enforce uniqueness
        length	    Maximum length
        updatable	Whether the column can be updated

    6) @Transient -> Field is not stored in database
    - The field will be ignored during database operations.
    - Useful for temporary or calculated fields.

    Example:
        @Entity
        public class Employee {
            @Id
            private Long id;

            @Transient
            private String tempData;
            // ...
        }

    7) @Temporal (Legacy) -> Maps Date/Time types
    - Used with java.util.Date and java.util.Calendar.
    - Specifies the temporal type:
        DATE: Date only
        TIME: Time only
        TIMESTAMP: Date and time

    Example:
        @Entity
        public class Employee {
            @Id
            private Long id;

            @Temporal(TemporalType.DATE)
            private Date birthDate;
            // ...
        }

    8) @Enumerated -> Stores Enum values
    - Used to store Java Enum values in the database.
    - Two modes:
        ORDINAL: Stores as index (0, 1, 2...)
        STRING: Stores as enum name

    Example:
        public enum Status {
            ACTIVE, INACTIVE, PENDING
        }

        @Entity
        public class Employee {
            @Id
            private Long id;

            @Enumerated(EnumType.STRING)
            private Status status;
            // ...
        }

    Class vs Entity
        Java Class	                Entity
        Normal Java class	    Database-mapped class
        No persistence	        Persistent
        No table mapping	    Maps to table
        Used in business logic	Used for database representation
        
    @Entity vs @Table
        @Entity	                            @Table
        Declares a class as an entity	Maps entity to a table
        Mandatory for JPA entities	    Optional
        Required for persistence	    Used to customize table mapping
        
    @Id vs @GeneratedValue
                @Id	                    @GeneratedValue
        Declares Primary Key	    Generates Primary Key value
        Mandatory	                Optional
        Identifies row	            Automates ID creation

    @Transient vs @Column
        @Transient	            @Column
        Not stored in DB	 Stored in DB
        Temporary field 	Persistent field
        */