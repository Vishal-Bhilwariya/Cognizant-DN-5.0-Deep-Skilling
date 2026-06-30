/*

 # Proxy Pattern :
 - Proxy Pattern provides a substitute (proxy) object that controls access to the real object. 
 
 Instead of directly accessing the real object, the client first talks to the Proxy.
 The Proxy decides:
    Allow access
    Deny access
    Delay loading
    Check security
    Log requests
Formula: Client → Proxy → Real Object

    Example:
    High Resolution Image
    Loading the image takes 10 seconds.

    Without Proxy:
            Client
               ↓
            Image Loaded
               ↓
            10 Seconds
        Even if the image is never viewed, it still loads.
    Solution : Use Proxy.
            Client
              ↓
            Proxy
              ↓
            Load Image Only When Needed
              ↓
            Real Image
    The Proxy delays object creation until it is actually required.
    This is called Lazy Loading.

    # Types of Proxy
    Type	            Purpose
    Virtual Proxy	    Delays object creation (Lazy Loading)
    Protection Proxy	Controls access using permissions
    Remote Proxy	    Represents an object located on another server
    Caching Proxy	    Stores previously fetched data for faster access

Advantages
    Controls object access.
    Improves security.
    Supports lazy loading.
    Reduces memory usage.
    Improves performance through caching.
    Hides complexity from the client.
Disadvantages
    Adds an extra layer, increasing complexity.
    May slightly slow requests due to the additional proxy step.
    More classes are required.
*/