/*

    # Query : 
    - A Query is a request sent to the database to retrieve, insert, update, or delete data.
    
    Suppose your database contains: 
        ID	Name	Branch
        1	Vishal	CSE
        2	Aman	IT
        3	Ravi	ECE

    If you want to display all students, Spring sends a query to the database.
    The database returns the data.
    This process is called Querying.
        
    # Types of Queries :
    1) Retrieve All Records
        SQL : SELECT * FROM Student;
        Spring : repository.findAll();

        Returns: All Students

    2) Retrieve One Record
        SQL : SELECT * FROM Student
              WHERE id = 1;
        Spring : repository.findById(1);

        Returns: Student with ID = 1

    3) Insert Data
        SQL : INSERT INTO Student ...
        Spring : repository.save(student);
        
    4) Update Data
        SQL : UPDATE Student ...
        Spring : repository.save(student);

        save() is commonly used for both insert and update depending on whether the entity already exists.

    5) Delete Data
        SQL  :  DELETE FROM Student
                WHERE id = 1;
        Spring : repository.deleteById(1);
        
    7) Repository Example
        public interface StudentRepository {
            List<Student> findAll();
            Student findById(int id);
            void save(Student student);
            void deleteById(int id);
        }

    Note: In real Spring Data JPA, the repository usually extends JpaRepository. That topic is beyond the scope of this 
          syllabus, so focus on understanding the methods conceptually.

    # Example :
    Controller :
        @Controller
        public class StudentController {
            @GetMapping("/students")
            public String showStudents(Model model){
                // Get data from Service
                List<Student> students = studentService.getAllStudents();
                // Add data to Model
                model.addAttribute("students", students);
                // Return View
                return "students";
            }
        }
    Service : 
        public List<Student> getAllStudents(){
            return repository.findAll();
        }

    Output
        Database

        ID	Name	Branch
        1	Vishal	CSE
        2	Aman	IT

    Advantages
        Easy data retrieval.
        Reduces manual database operations.
        Clean architecture using Repository.
        Easy integration with Spring ORM.
        Improves code readability.
*/