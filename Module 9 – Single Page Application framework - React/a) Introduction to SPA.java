/*

    # What is a Single Page Application (SPA)?
    - A Single Page Application (SPA) is a web application that loads only one HTML page initially. After that, whenever the user performs any action (clicks a button, opens a profile, navigates to another page), only the required part of the page is updated instead of reloading the entire webpage.

    Imagine you open Instagram.
        You click:
            Home
            Profile
            Messages
            Notifications

        Did the browser show a loading screen every time?
        No.

        Only the content changed while:
            Header remained the same
            Navigation bar remained the same
            Browser never refreshed completely

        That is called a Single Page Application (SPA).

    Why do we need SPA?
     Before understanding SPA, let's understand the problem it solved.

     Traditional Website (Multi Page Application)
        Suppose you're using an old shopping website.

        Home
          ↓
        Click Products
          ↓
        Whole page reloads
          ↓
        Click Product Details
          ↓
        Whole page reloads
          ↓
        Click Cart
          ↓
        Whole page reloads

     Every click sends a request to the server, which generates a completely new HTML page.

     Problems with Traditional Websites
        Slow navigation
        Screen flickering
        Higher server load
        More bandwidth consumption
        Poor user experience

    Imagine a page of 100 KB.
        You change only one product.
        The browser still downloads another 100 KB page.
        Very inefficient.

    SPA Solution
        SPA says: "Don't reload the whole house just because one room changed."

        Instead:
            Load the application once.
            Update only the required section.

        Result:
            Faster
            Smoother
            Better user experience

    Single Page Application
                 First Request
                      │
                      ▼
                index.html
                      │
                      ▼
            React Starts in Browser
                      │
        ┌─────────────┼─────────────┐
        ▼             ▼             ▼
     Home         Products      Profile
        │             │             │
        └────── Updates UI Only ────┘

    Real-Life Analogy
        Imagine your house.
        Traditional Website:
            You want to change the TV.
            So you destroy the entire house.
            Build it again.
            Install the TV.
            😂 Doesn't make sense.

        SPA
            Simply replace the TV.
            Everything else stays.
            Exactly what React does.

    # Minimal Implementation :
     Normal HTML Website
        home.html -> <a href="about.html">About</a>

        Clicking About
            ↓
        Browser requests another HTML page.
            ↓
        Entire page reloads.

     React SPA
        function App() {
          return (
            <div>
              <h1>Home</h1>
              <button>Go to Profile</button>
            </div>
          );
        }

        Later (using React Router), clicking Go to Profile changes only the displayed content without reloading the page.
        What this example teaches
        You don't need multiple HTML files for every screen. A single React application can render different views dynamically.

Advantages
    Faster user experience
    No full page refresh
    Better performance after initial load
    Lower bandwidth usage
    Easy integration with REST APIs
    Better code organization
    Suitable for enterprise applications
    Supports real-time updates
*/