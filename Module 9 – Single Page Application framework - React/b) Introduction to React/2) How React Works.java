/*

    # How React Works :
    React works by creating and managing the User Interface (UI) inside the browser using JavaScript.
    Instead of asking the server to generate a new webpage every time, React updates only the part of the page that changes.

    Suppose you open a React application.
     The browser downloads:
        index.html
        CSS
        JavaScript (React)

        After that, React takes control of the webpage.
        Whenever you:
            Click a button
            Fill a form
            Like a post
            Open your profile

        React changes only the affected part of the screen.
        The browser does not reload.

    Why do we need this working mechanism?
     Let's compare the old approach.

    Traditional Website
        Every click:
        User Click
            ↓
        Browser sends Request
            ↓
        Server creates HTML
            ↓
        Browser downloads HTML
            ↓
        Whole page reloads

        This happens repeatedly.

    React
        User Click
            ↓
        React updates UI
            ↓
        Done

        No new webpage.
        No full refresh.
        Only the changed section updates.

    Real-Life Analogy
        Imagine a classroom.
     Teacher writes:
        Student Marks
            Rahul 90
            Amit 75
            Riya 81

        Now Rahul scores 95

    Traditional Website:
        Erase the entire board.
        Write everything again.

    React:
        Erase only
        90
        ↓
        95

        Everything else remains untouched.
        That is exactly React's philosophy.

    Advantages
        Faster rendering
        Better user experience
        Component reuse
        Easy maintenance
        Less server work
        Excellent scalability
        Perfect for SPAs

*/