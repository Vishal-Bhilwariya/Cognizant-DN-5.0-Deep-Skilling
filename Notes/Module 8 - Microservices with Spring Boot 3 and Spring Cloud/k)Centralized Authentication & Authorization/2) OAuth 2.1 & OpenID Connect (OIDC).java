/*

    OAuth2 provides Authorization.
    OIDC provides Authentication.

    # OAuth 2.1
    - OAuth2 is an Authorization Framework that allows one application to access another application's resources without sharing the user's password.

    Suppose you want to login into a shopping app using Google.
        Instead of giving your Google password to the shopping app,you login directly on Google's website.
        Google verifies you and sends a token.
        The shopping app trusts Google.
        Your password is never shared.

    Why do we need OAuth2?
        Imagine this dangerous situation.

        Shopping App
            ↓
        Please Enter Google Password Here

        Very risky.
        If the app is hacked, your Google account is compromised.
        OAuth2 solves this problem.

    Advantages
        Password never shared
        Secure login
        Industry standard
        Supports third-party login
        Easy integration

    # OpenID Connect (OIDC) :
    - It is an Identity Layer built on top of OAuth2.
    - It adds Authentication on top of Authorization.
    - OIDC tells the application : Who the user is.

    OAuth2 only says User has permission.
     OIDC additionally says
        User is Vishal.
        Email: abc@gmail.com
        Verified User

        Identity information comes from OIDC.

    Why do we need OIDC?
     Suppose application receives an Access Token.
        Great.
        But
        Who owns this token?
        OAuth2 doesn't tell us.
        OIDC solves this.

    Advantages
        User identity
        Secure login
        Standard authentication
        Works with OAuth2
        Supports SSO

    Access Token vs ID Token
        Access Token	            ID Token
        Used to access APIs	    Used to identify the user
        OAuth2	                OIDC
        Permission	            Identity
        Resource Access	        User Information
*/