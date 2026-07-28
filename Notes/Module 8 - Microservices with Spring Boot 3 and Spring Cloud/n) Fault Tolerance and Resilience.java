/*

    # What is Fault Tolerance? 
    - Fault Tolerance is the ability of a system to continue working even when some components fail.

    Suppose
        Payment Service crashes.
        Instead of crashing the whole application, the system continues operating using alternative strategies

    Real-Life Analogy
     Aircraft
        Even if one engine fails, the aircraft can continue flying safely.
        This is Fault Tolerance.

    Advantages
        High Availability
        Better User Experience
        Prevents System Failure
        Business Continuity

    # What is Resilience?
    - Resilience is the ability of a system to adapt and recover quickly from failures.
    - It's like bouncing back from a setback.

    Real-Life Analogy
     Person
        When a person faces a challenge:
            They adapt
            They recover
            They move forward

        That's Resilience.

    Advantages
        Quick Recovery
        Adaptability
        Reduced Downtime
        Improved Stability

    Difference
        Fault Tolerance
             ↓
        Keeps system running.

        Resilience
            ↓
        Helps system recover quickly.

    # Spring Cloud Hystrix :
    - What is Hystrix?
        Hystrix was a Netflix library used to implement
            Circuit Breaker
            Fallback
            Fault Tolerance

    Real-Life Analogy
     Electrical Fuse
        When overload occurs, the fuse disconnects electricity, protecting the system.

     Advantages
        Prevents Cascading Failures
        Supports Fallback
        Better Stability

    # Circuit Breaker :
    - Circuit Breaker prevents repeated requests to a failed service.

    # Fallback Mechanism :
    - Fallback provides an alternative response when the main service is unavailable.
    Example
         Payment Service crashes.
         Instead of 500 Internal Server Error
         User sees Payment Service is temporarily unavailable.
                   Please try again later.
            Application still responds gracefully.

    Real-Life Analogy
     Backup Generator
        When main power fails, the backup generator kicks in.
        It ensures continuity.

    Advantages
        Improved User Experience
        System Stability
        Graceful Degradation

    # Retry Strategy :
    - Retry automatically retries a failed request before giving up.
    Why?
        Sometimes failures are temporary.
     Example
        Network timeout.
        Second attempt succeeds.

    Real-Life Analogy
        Phone Call
        Call Busy.
        Try Again.
        Busy.
        Try Again.
        Connected.

    Advantages
        Handles Temporary Failures
        Better Reliability
        Automatic Recovery

    # Handling Transient Faults :
    - A Transient Fault is a temporary failure that disappears after some time.
    Examples
        Network Timeout
        Temporary Database Failure
        Temporary Service Unavailable
        High Network Latency
        
    Solution
      Use
        Retry
        Circuit Breaker
        Timeout
        Fallback
*/