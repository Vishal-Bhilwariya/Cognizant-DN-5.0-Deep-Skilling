/*

    # Authentication :
    - Authentication is the process of verifying who the user is.
     It answers the question: "Who are you?"

    Suppose you log in to Amazon.
     You enter:
        Username
        Password

        The system checks whether these credentials are correct.
        If correct, you are authenticated.

    Advantages
        Verifies user identity
        Prevents unauthorized access
        Protects user accounts
        Improves application security

    # Authorization
     Authorization determines what an authenticated user is allowed to do.
     It answers the question: "What are you allowed to access?"

    Advantages
        Controls permissions
        Protects sensitive data
        Prevents unauthorized actions
        Implements role-based access

    # Secure Communication (HTTPS) :
    - HTTPS is a secure version of HTTP.
    - It encrypts data before sending it over the network.

    Why do we need HTTPS?
     Suppose Login Service sends
        Username
        Password

        using HTTP.

     Anyone on the network can read it.
        Very dangerous.

    Using HTTPS
        Username
        Password
            ↓
        Encrypted
            ↓
        Internet
            ↓
        Decrypted

        Nobody can read the data.

    Real-Life Analogy
        Locked Courier Box
        Suppose you send money.
        Instead of sending it openly, you lock it inside a secure box.
        Only the receiver has the key.
        HTTPS works similarly.

    Advantages
        Data encryption
        Prevents data theft
        Prevents Man-in-the-Middle attacks
        Secure communication

    # OAuth2 :
    - OAuth2 is an authorization framework that allows users to grant applications limited access to their resources without sharing passwords.
    
    Why do we need OAuth2?
     Suppose you click
        Login with Google

        You never give your Google password to that application.
        Instead,
            Google verifies you.
            Google sends an Access Token.
            The application trusts Google.

    Real-Life Analogy
     Hotel Reception
        Instead of showing your house keys, you show your government ID.
        The hotel verifies your identity.

        Similarly,
        OAuth2 lets another trusted service verify you.

    Advantages
        Password never shared
        Secure login
        Supports Single Sign-On (SSO)
        Industry standard
        Easy integration with Google, GitHub, Facebook, Microsoft

    # Security Best Practices :
     1. Always use HTTPS - Never expose APIs over HTTP.
     2. Never hardcode passwords
            Wrong
                password = admin123

            Correct
                Use environment variables or Config Server.

     3. Validate Every Request
        Never trust client input.
        Always validate.

     4. Use Strong Passwords
        Weak 123456
        Strong Xy@2026#Secure
        
     5. Least Privilege Principle
        Give only required permissions.
        Never give Admin access unnecessarily.

     6. Rotate Tokens
        Access Tokens should expire.
        Generate new ones regularly.

     7. Encrypt Sensitive Data
        Examples
            Passwords
            Credit Card Numbers
            Personal Information
        
     8. Log Security Events
        Log
            Login Success
            Login Failure
            Unauthorized Access
            Token Expiration
*/

