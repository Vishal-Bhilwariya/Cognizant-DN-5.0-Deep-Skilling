/*

 # Model-View-Controller ( MVC ) :
 - MVC is an architectural pattern that separates an application into three components: Model, View, and Controller.

 Instead of writing all code in one class,MVC divides the application into three responsibilities.

    Component	Responsibility
    Model   	Manages data and business logic
    View	    Displays data to the user
    Controller	Receives user requests and connects Model with View
    
    This separation makes applications easier to build, maintain, and test.

                User
                 |
                 ▼
          Controller
           /       \
          ▼         ▼
      Model       View
          \         ▲
           \________|

    MODEL :
        class Student {
            private String name = "Vishal";
            public String getName() {
                return name;
            }
        }
    VIEW :
        class StudentView {
            public void display(String name) {
                System.out.println("Student Name: " + name);
            }
        }
    CONTROLLER
        class StudentController {
            private Student model;
            private StudentView view;
            StudentController(Student model, StudentView view) {
                this.model = model;
                this.view = view;
            }
            void updateView() {
                view.display(model.getName());
            }
        }
    MAIN CLASS :
        public class Main {
            public static void main(String[] args) {
                Student model = new Student();
                StudentView view = new StudentView();
                StudentController controller = new StudentController(model, view);
                controller.updateView();
            }
        }
    OUTPUT :  Student Name: Vishal

Advantages
    Separation of concerns.
    Easy maintenance.
    Easy testing.
    Better code organization.
    Multiple Views can use the same Model.
    Supports team development (Frontend and Backend teams can work independently).
Disadvantages
    More classes are required.
    Slightly more complex for small projects.
    Communication between layers adds some complexity.
*/