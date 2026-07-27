/*

    React is an open-source JavaScript library used to build interactive and dynamic User Interfaces (UI), especially Single Page Applications (SPAs).
    It was developed by Meta (Facebook) in 2013.

    Suppose you're building an online shopping website.
     It has:
        Home Page
        Login Page
        Product Page
        Cart
        Payment
        Profile

        Instead of writing the UI as one huge HTML file, React allows you to divide it into small reusable pieces called Components.
        Think of React as a tool that helps you build the frontend (what users see and interact with) efficiently.

    Why was React Created?
     Before React, developers mainly used:
        HTML
        CSS
        JavaScript
        jQuery

        As web applications grew larger (Facebook, Gmail, Netflix), managing the UI became difficult.
        Imagine updating the "Like" button on Facebook using plain JavaScript. Developers had to manually:
            Find the HTML element
            Change its content
            Update the count
            Handle multiple events
            Ensure other parts weren't affected

        This made code:
            Hard to maintain
            Error-prone
            Difficult to scale
            React's Solution

        React introduced:
            Reusable Components
            Automatic UI updates
            Efficient rendering
            Better code organization

    Why is React Called a Library, Not a Framework?
        
    What is a Library?
        A library provides tools to solve a specific problem.
        React focuses only on one responsibility:
        Building the User Interface (UI).
        It doesn't force you to use:
            A specific router
            A specific database
            A specific backend
            A specific state management library

        You choose those yourself.

    What is a Framework?
     A framework provides a complete structure for building an application.
        It often decides:
            Project structure
            Routing
            State management
            Architecture
            Development conventions

        Examples:
            Angular
            Spring Boot

    Imagine you're building a car.
     A car consists of:
        Engine
        Wheels
        Doors
        Seats
        Dashboard

        Each part is built separately and then assembled.
        React works similarly.
        A webpage is divided into small reusable components:
            Website
            │
            ├── Header
            ├── Navbar
            ├── Sidebar
            ├── Product Card
            ├── Footer

    Implementation
        // A simple React component
        function App() {
            // Return the UI to display
            return (
                <h1>Hello React!</h1>
            );
        }
        // Export this component so other files can use it
        export default App;

    Advantages
        Easy to learn
        Component-based architecture
        Reusable code
        Faster UI updates
        Large ecosystem
        Strong community support
        Excellent for SPAs
        Easy integration with Spring Boot
*/