/*

    # Role-Based Access Control (RBAC) :
    - RBAC (Role-Based Access Control) is a security model where permissions are assigned to roles, and users receive permissions through their assigned role.
    
    Why do we need RBAC?
     Without RBAC
        Every User
            ↓
        Can Access Everything

        Very dangerous.

     With RBAC
        Admin
         ↓
        Manage Users
        Delete Products
        View Reports
        
        Customer
            ↓
        View Products
        Place Orders

      Different permissions.

    Real-Life Analogy
        Airport Security
        Different access levels based on roles.
        Security personnel → Full access
        Passengers → Limited access

    Advantages
        Centralized Control
        Easy Management
        Reduced Errors
        Compliance

    # Securing Communication Between Microservices :
    - In microservices, securing communication between services is crucial to prevent unauthorized access and data breaches.

    Why do we need to secure inter-service communication?
     Consider a banking application with multiple services:
        User Service
        Account Service
        Transaction Service

        If not secured:
            Any service could access sensitive data.
            Data breaches occur.
            Financial loss.

    How to secure communication?
        Use HTTPS for all internal communications.
        Implement service-to-service authentication.
        Use API Gateways with built-in security features.
        Employ mutual TLS (mTLS) for encrypted communication.

    Best Practices
        HTTPS Everywhere
        Validate JWT
        Use Mutual TLS (mTLS) for highly secure internal communication
        Never expose internal services directly

    Real-Life Analogy
        Corporate Network
        Employees can access internal systems.
        External parties cannot.
        Firewalls and access controls enforce this.

    Advantages
        Data Protection
        Prevents Unauthorized Access
        Ensures Integrity
        Compliance with Regulations

    # Securing Sensitive Data :
    - Securing sensitive data involves protecting information from unauthorized access, disclosure, or theft.

    What is Sensitive Data?
     Examples
        Passwords
        API Keys
        Database Passwords
        Credit Card Numbers
        JWT Secrets
        OAuth Client Secrets

    Why is it important?
        Data Breaches
            Financial Loss
            Legal Consequences
            Reputational Damage

        Regulatory Compliance
            GDPR
            HIPAA
            PCI DSS

    How to secure sensitive data?
        Encryption
            At Rest
            In Transit

        Access Control
            RBAC
            ABAC

        Data Masking
            Hide sensitive details in logs or displays

        Regular Audits
            Monitor access
            Identify vulnerabilities

    Best Practices
        Encrypt All Sensitive Data
        Use Strong Encryption Algorithms
        Implement Key Management
        Regular Security Assessments
        Data Loss Prevention (DLP) Tools

    Real-Life Analogy
        Safe in a Bank
        Only authorized personnel can access.
        Multiple layers of security.

    Advantages
        Privacy Protection
        Compliance
        Risk Mitigation
        Trust Building

    # Security Policies & Best Practices :
    - Common Best Practices
        Authentication : Always verify user identity.
        Authorization : Grant only required permissions.
        Least Privilege : Give users only the permissions they need.
        HTTPS Everywhere : Encrypt all communication.
        Validate JWT : Never trust incoming tokens blindly.
        Token Expiration : Always configure token expiry.
        Input Validation : Prevent SQL Injection, XSS, and invalid inputs.
        Logging : Log security events.
            Never log
                Passwords
                JWT Tokens
                Credit Card Numbers        
        Monitoring
            Monitor
                Failed Login Attempts
                Suspicious Requests
                Unauthorized Access
        Regular Updates
            Keep
                Spring Boot
                Spring Security
                Dependencies
            up to date.

    Real-Life Analogy
     Bank Security
        Bank Security includes
            CCTV
            Security Guards
            Password
            Vault
            Alarm
        Not just one security layer.

        Similarly, Microservices use multiple security layers.

    Advantages
        Strong Security
        Better Compliance
        Prevents Data Leaks
        Protects Business
*/