/*
========================================
Fetch API in React
========================================

Definition:
- APIs (Application Programming Interfaces) allow React applications to communicate with servers and retrieve data.
- Fetched data is usually stored in state and displayed in the UI.

Why Fetch Data?
- Display dynamic content.
- Connect frontend with backend.
- Show users, products, posts, etc.
- Keep UI updated with server data.

----------------------------------------
Basic Fetch Flow
----------------------------------------

Component Loads
      ↓
API Request
      ↓
Receive Response
      ↓
Convert to JSON
      ↓
Store in State
      ↓
Display UI

----------------------------------------
Method 1: fetch() (Built-in)
----------------------------------------

Definition:
- Native JavaScript method for making HTTP requests.
- No external library required.

Syntax:

fetch(url)
   .then(res => res.json())
   .then(data => setData(data));

Advantages:
- Built into JavaScript.
- Lightweight.
- No installation required.

Disadvantages:
- Manual JSON conversion.
- Manual error handling.

----------------------------------------
Method 2: Axios
----------------------------------------

Definition:
- Popular HTTP client library.
- Simpler and cleaner than fetch().

Installation:
npm install axios

Syntax:

axios.get(url)
   .then(res => setData(res.data));

Advantages:
- Automatic JSON parsing.
- Better error handling.
- Supports interceptors.
- Cleaner syntax.

Disadvantages:
- External dependency.

----------------------------------------
Method 3: SWR
----------------------------------------

Definition:
- React data-fetching library by Vercel.
- Uses "Stale While Revalidate" strategy.

Installation:
npm install swr

Features:
- Automatic caching.
- Background revalidation.
- Auto refetch.
- Loading and error handling.

Best For:
- Frequently changing data.

----------------------------------------
Method 4: React Query
----------------------------------------

Definition:
- Advanced server-state management library.

Installation:
npm install react-query

Features:
- Data caching.
- Background refetching.
- Pagination.
- Mutations.
- Error handling.

Best For:
- Large production applications.

----------------------------------------
Method 5: useFetch Hook
----------------------------------------

Definition:
- Custom hook that simplifies API fetching.

Installation:
npm install react-fetch-hook

Features:
- Minimal setup.
- Easy to reuse.
- Handles loading and errors.

Best For:
- Small to medium projects.

----------------------------------------
Loading and Error Handling
----------------------------------------

Loading:
Show loading message while data is being fetched.

Example:
if(isLoading)
   return <p>Loading...</p>;

Error:
Display error if request fails.

Example:
if(error)
   return <p>Error...</p>;

----------------------------------------
Comparison
----------------------------------------

fetch()
- Built-in
- Lightweight
- Manual JSON parsing

Axios
- External library
- Cleaner syntax
- Better error handling

SWR
- Automatic caching
- Background updates
- Performance focused

React Query
- Advanced caching
- Pagination
- Production ready

useFetch
- Simple custom hook
- Easy setup
- Lightweight

----------------------------------------
Best Practices
----------------------------------------

✔ Fetch data inside useEffect().
✔ Store API data using useState().
✔ Handle loading state.
✔ Handle errors properly.
✔ Use unique keys while rendering fetched lists.

----------------------------------------
Quick Revision
----------------------------------------

API
- Connects frontend with backend.

Basic Flow:
API → JSON → State → UI

Methods:
- fetch()
- Axios
- SWR
- React Query
- useFetch

Most Common:
- fetch()
- Axios

Best for Large Apps:
- React Query

Best for Performance:
- SWR

Important Hooks:
- useState()
- useEffect()

Interview Points:
- fetch() is built into JavaScript.
- Axios automatically parses JSON.
- SWR provides caching and background revalidation.
- React Query is used for advanced server-state management.
- API data is commonly fetched inside useEffect() and stored using useState().
*/