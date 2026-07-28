/*

    Before We Start
     Imagine you built an Employee API.
        POST   /employees
        GET    /employees
        PUT    /employees/{id}
        DELETE /employees/{id}

     Question:
        How do you know these APIs work correctly?
            What if GET returns wrong data?
            What if DELETE deletes the wrong employee?
            What if POST accepts invalid input?
            What if a future code change breaks the API?
        Instead of manually testing every time, we write automated tests.

    # What is API Testing?
        API Testing is the process of verifying that REST APIs behave correctly by checking:
            Functionality
            Inputs
            Outputs
            Status Codes
            Business Logic
            Error Handling 

    Imagine a car factory.
        Every car is tested before leaving the factory.
        Similarly, Every API should be tested before deployment.

    Why do we need API Testing?
     Without testing
        Bugs reach production
        Customers face errors
        Future updates break existing APIs.

     Testing ensures:
        Reliability
        Stability
        Maintainability

    Types of Testing
        Testing Type	            Purpose
        Unit Testing	        Test one component
        Integration Testing	    Test multiple components together
        System Testing	        Test complete application
        End-to-End Testing	    Simulate real user

    # Unit Testing REST Controllers
     Unit Testing verifies a single class or component in isolation.

    Example
        Only test EmployeeController

        Not database.
        Not external services.

    # JUnit
     - JUnit is the most widely used Java testing framework.
        It provides:
            Test execution
            Assertions
            Test reports
            Why JUnit?

        Without JUnit : Developers test manually.
        With JUnit : Tests run automatically.

     Common JUnit Annotations
        Annotation	            Purpose
        @Test	        Marks test method
        @BeforeEach	    Runs before every test
        @AfterEach	    Runs after every test
        @BeforeAll	    Runs once before all tests
        @AfterAll	    Runs once after all tests

    Example
        @Test
        void testGetEmployee(){
            // Verify that getEmployee() returns expected value
        }

    # Mockito
      Mockito is a Java mocking framework.
      It creates fake objects (Mocks) for testing.

     Why Mockito?
        Suppose Controller depends on EmployeeService

        Instead of calling real database, Mockito creates Fake EmployeeService
        This makes tests faster and more reliable.

    Common Mockito Annotations
        Annotation	                            Purpose
        @Mock	                            Create mock object
        @InjectMocks	                    Inject mocks into class
        @ExtendWith(MockitoExtension.class)	Enable Mockito

    Example
        @Mock
        EmployeeService service;

        @InjectMocks
        EmployeeController controller;

    # Integration Testing :
    Integration Testing verifies that multiple components work together correctly.

    Example
        Controller
            ↓
        Service
            ↓
        Repository
            ↓
        Database

        Everything is tested together.

    Why Integration Testing?
        Unit tests may pass.
        But
        Controller and Database may fail together.

        Integration Testing catches such problems.

    Spring Test and MockMvc
     1) Spring Test
         Spring Test is Spring's testing framework.
         It helps test Spring applications.

     2) MockMvc
        MockMvc simulates HTTP requests without starting a real web server.

    Why MockMvc?
        Instead of
        Running application
            ↓
        Opening browser
            ↓
        Calling API

        MockMvc directly simulates
            GET
            POST
            PUT
            DELETE

        inside the test.

    Exampl : mockMvc.perform(get("/employees"));

    # Test Coverage :
        Test Coverage measures how much of the application's code is executed during testing.
        Test Coverage measures how much of your code is tested.
        100% coverage is ideal.
        But not always possible.

        Tools like JaCoCo help measure coverage.

    Example
        Application : 100 Methods
        Tests execute : 80 Methods
        Coverage : 80%

    Coverage Types
        Coverage	            Purpose
        Line Coverage	    Executed lines
        Method Coverage	    Executed methods
        Branch Coverage	    if/else coverage
        Statement Coverage	Executed statements

    # Best Practices
     Write Independent Tests
        Each test should work independently.

        Test One Thing
            One test
                ↓
            One responsibility.

     Meaningful Test Names
        Bad name-> test1()
        Good name-> shouldReturnEmployeeWhenIdExists()
        
     Mock External Systems
        Don't call
            Payment Gateway
            Email Server
            Third-party APIs
        during unit tests.

     Test Positive and Negative Cases
        Positive : Employee Exists
        Negative : Employee Not Found
        
     Keep Tests Fast
        Slow tests discourage frequent execution.
*/