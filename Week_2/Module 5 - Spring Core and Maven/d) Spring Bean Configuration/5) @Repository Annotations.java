/*

    # What is @Repository?
    - @Repository is a Spring stereotype annotation used to mark a class that communicates with the database.

    Suppose you're building a Student Management System.

    You need to:
        Save student details
        Update student details
        Delete student records
        Find a student by ID

     Which class should do these database operations?
        A class annotated with:

        @Repository
        public class StudentRepository {

        }

        Spring understands: "This class is responsible for database operations."

    Common Database Operations 
    Method	    Operation
    save()	    Insert data
    findById()	Read one record
    findAll()	Read all records
    update()	Modify data
    delete()	Remove data
   Advantages
        Separates database code from business logic.
        Improves maintainability.
        Makes testing easier.
        Organizes code according to layered architecture.
        Spring provides automatic exception translation for repository classes.

*/