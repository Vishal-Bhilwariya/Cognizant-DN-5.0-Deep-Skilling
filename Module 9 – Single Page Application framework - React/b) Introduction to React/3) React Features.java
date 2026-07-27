/*

# React Features are the characteristics and capabilities that make React powerful, efficient, and suitable for building modern web applications. 

    Think of React as a toolbox.
     The toolbox contains many useful tools:
        Components
        Virtual DOM
        JSX
        One-way Data Flow
        Reusability
        Fast Rendering

        These are called React Features.

    They help developers build applications that are:
        Faster
        Easier to maintain
        Easier to scale

    Why do we need these features?
        Imagine building Amazon using only HTML and JavaScript.

        You would have:
            Thousands of products
            Hundreds of pages
            Shopping cart
            Search
            Login
            Payment
            User Profile

        Managing all this manually becomes very difficult.
        React's features solve these problems by making development modular, efficient, and maintainable.

# Core Features of React :
 
 Feature 1: Component-Based Architecture
     What is a Component?
        A component is a small, reusable piece of UI.
        Instead of writing one huge webpage, React divides it into smaller parts.
     In React, the UI is built using components.
        Components are like building blocks.
        You can build a complex UI by combining simple components.

        Example:
            A website can be made of:
                Header Component
                Navigation Component
                Product Component
                Footer Component

        Each component is independent and can be reused.

    Why is this useful?
        Suppose your website has 100 pages.
        All pages use the same navigation bar.
        Without React:
            Copy the navbar 100 times.

        With React:
            <Navbar />

            Write it once.
            Reuse it everywhere.

 Feature 2: Virtual DOM
    React uses a Virtual DOM.
        The Virtual DOM is a lightweight copy of the real DOM.
        When something changes, React first updates the Virtual DOM.
        Then, it compares the Virtual DOM with the real DOM.
        Finally, it updates only the parts that have changed in the real DOM.

        This makes React faster.

 Feature 3: JSX (JavaScript XML)
    JSX allows you to write HTML-like code in JavaScript.
        It makes the code more readable and easier to understand.

        Example:
            Without JSX:
                return React.createElement('h1', null, 'Hello React!');

            With JSX:
                return <h1>Hello React!</h1>;

 Feature 4: One-Way Data Flow
    Data flows in one direction in React.
        Parent components pass data to child components through props.
        Child components cannot directly modify the parent's data.

        This makes debugging easier and improves app stability.

 Feature 5: Reusability
    Components can be reused throughout the application.
        For example, a Button component can be used on multiple pages.

 Feature 6: Fast Rendering
    Thanks to the Virtual DOM, React renders updates quickly.
        Only the changed parts are updated in the real DOM.

    These features make React a powerful tool for building modern web applications.

Real-Life Analogy
    Imagine building a house.
    Instead of constructing every room from scratch, you use prefabricated parts:
        Doors
        Windows
        Roof
        Kitchen Cabinets

        These parts are reused across many houses.
        React components work the same way.
        Build once.
        Reuse everywhere.

Advantages
    Reusable Components
    Faster UI Updates
    Better Performance
    Cleaner Code
    Easier Maintenance
    Component-Based Architecture
    Easy API Integration
    Scalable for Large Applications
*/