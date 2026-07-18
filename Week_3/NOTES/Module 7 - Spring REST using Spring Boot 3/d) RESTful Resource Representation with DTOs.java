/*

    # Before Learning DTOs
        Let's first understand an important question.

        Suppose your database contains an Employee table.
        Employee Table
            ---------------------------------------------------
            ID | Name   | Salary | Password | Aadhaar | Email
            ---------------------------------------------------
            101| Vishal | 50000  | abc123   | XXXXX   | v@gmail.com
            ---------------------------------------------------

        Now a client requests: GET /employees/101
        Should we return the complete Employee object?
            {
              "id":101,
              "name":"Vishal",
              "salary":50000,
              "password":"abc123",
              "aadhaar":"XXXXX",
              "email":"v@gmail.com"
            }

         No.
        The client should never receive sensitive or unnecessary information.
        Instead, we return:
            {
               "id":101,
               "name":"Vishal",
               "email":"v@gmail.com"
            }

        How?
            Using DTOs.

    # Introduction to Data Transfer Objects (DTOs) :
    - It is a simple Java object used to transfer only the required data between different layers or between the server and the client
    - A DTO does not contain business logic. It mainly stores data.

    Think of a DTO as a filtered copy of an object.
    The original object may contain many fields, but the DTO exposes only the fields needed by the client.

    DTOs are used because they:
        Hide sensitive data
        Reduce response size
        Improve security
        Decouple API from database
        Support API versioning
        Improve maintainability

    DTO vs Entity
            Entity	                        DTO
        Represents Database Table	Represents API Data
        Connected to JPA        	Independent of Database
        Contains all fields	        Contains only required fields
        Used inside application	    Sent to Client
        Persistent Object	        Transfer Object

    Code Example
     Entity
        @Entity
        public class Employee {
            private Long id;
            private String name;
            private String password;
            private String aadhaar;
            private String email;
        }
     DTO
        public class EmployeeDTO {
            private Long id;
            private String name;
            private String email;
        }

     Notice: Password and Aadhaar are removed.

    # Mapping Entities to DTOs
        Mapping means converting an Entity object into a DTO object (or vice versa).

     Why Mapping?
        Entity -: Employee
            ↓
        Client needs -: EmployeeDTO

        Someone has to copy data.
        That process is called Mapping.

    # Types of Mapping
     1) Manual Mapping : Developer copies fields one by one.
        Ex  :
            EmployeeDTO dto = new EmployeeDTO();
            dto.setId(employee.getId());
            dto.setName(employee.getName());
            dto.setEmail(employee.getEmail());

     2) Automatic Mapping
        Libraries like:
            ModelMapper
            MapStruct
            perform mapping automatically.
        Ex
            ModelMapper mapper = new ModelMapper();
            EmployeeDTO dto = mapper.map(employee, EmployeeDTO.class);

     Comparison
        Manual Mapping	            Automatic Mapping
        More code	                Less code
        Better control	            Faster development
        No external library	        Requires library
        Easy for small projects	    Better for large projects

    # Customizing JSON Serialization :
    - Serialization means: Converting a Java Object into JSON.
    
    Why Customize Serialization?
     Sometimes we don't want all fields.
     Example
        EmployeeDTO
            id
            name
            salary
            password

        Need JSON
            {
            "id":101,
            "name":"Vishal"
            }

        Ignore
            salary
            password

        Annotation	        Purpose
        @JsonIgnore	        Ignore Field
        @JsonProperty	    Rename Field
        @JsonInclude	    Ignore Null Values
        @JsonFormat	        Format Date

    # Customizing JSON Deserialization :
    - Deserialization means: Converting JSON into a Java Object.

    Example
        JSON
            {
            "id":101,
            "name":"Vishal"
            }

        Java Object
            Employee employee = new Employee();
            employee.setId(101);
            employee.setName("Vishal");

    Annotations
        @JsonProperty	    Bind JSON field to Java field
        @JsonCreator	    Specify constructor for deserialization
        @JsonFormat	        Parse Date format

    # API Versioning
     - API Versioning means maintaining multiple versions of the same API without breaking existing clients.

     Why do we need Versioning?
        Suppose today API returns
            {
            "id":101,
            "name":"Vishal"
            }

        Tomorrow company adds
            {
            "id":101,
            "name":"Vishal",
            "email":"v@gmail.com",
            "department":"IT"
            }

        Old mobile application may fail.

        Solution : Version APIs.

    Types of Versioning
     1. URI Versioning
        /api/v1/employees
        /api/v2/employees
        Most common.

     2. Request Parameter
        /employees?version=1
        
     3. Header Versioning
        API-Version:1
        
     4. Media Type Versioning
        Accept: application/vnd.company.v1+json

    # Backward Compatibility
     -Backward Compatibility means: Old clients should continue working even after the API is updated.

     Example
        Old API
            {
            "id":101,
            "name":"Vishal"
            }

        New API
            {
            "id":101,
            "name":"Vishal",
            "email":"v@gmail.com"
            }

        If the old application still works,the API is backward compatible.

     Why Important?
        Companies cannot force millions of users to update their applications immediately.
        Old apps and new apps must work together.

    Advantages
        Improves API security.
        Prevents exposure of sensitive information.
        Reduces response payload size.
        Decouples API from database design.
        Supports API evolution through versioning.
        Enables backward compatibility.
        Makes enterprise APIs easier to maintain.
*/