/*

    # What is Auditing? 
    - Auditing is the process of automatically recording who created, who modified, when it was created, and when it was last modified for a database record.
    - Auditing = Tracking the history of database records automatically.

    It answers questions like:
        Who created this record?
        When was it created?
        Who modified it?
        When was it modified? 

    # Why Do We Need Auditing?
     - Imagine an Employee Management System.
        An employee's salary changes from ₹50,000 to ₹70,000.

        Later, the manager asks:
            Who changed the salary?
            When was it changed?

        Without auditing, there is no record of these changes.
        With auditing,the system automatically stores this information

    # Real-Life Example
     - Suppose Google Docs.
       You and your team are working on a shared document.
        When you edit a document,
        it shows:
            Created By:
            Vishal
    
            Created On:
            15 July 2026
    
            Last Modified By:
            Rahul
    
            Last Modified On:
            18 July 2026
        This is Auditing.

    # Entity Auditing
     - Entity Auditing means adding audit information directly to an Entity.

     Example
        Employee Table

        ID	Name	Created By	Created Date	Last Modified By	Last Modified Date
        1	Rahul	Admin	10-Jul	Manager	15-Jul

        Notice: Apart from employee data, audit information is also stored.

    # @CreatedBy - Automatically stores who created the record. (set once)
            Purpose
                Useful for:
                    Banking
                    Hospital Systems
                    ERP
                    Inventory

                where knowing the creator is important.

    # @LastModifiedBy - Automatically stores who last modified the record.(update after each modification)
            Purpose
                Tracks changes made by users.
                Useful for:
                    Audit Trails
                    Compliance
                    Accountability

    # @CreatedDate - Automatically stores when the record was created. (set once)
            Purpose
                Records the creation timestamp.
                Useful for:
                    Time-based reports
                    Analytics
                    Historical tracking
                    Registration Date

    # @LastModifiedDate - Automatically stores when the record was last modified. (update after each modification)
            Purpose
                Tracks the last update time.
                Useful for:
                    Audit trails
                    Change logs
                    Data freshness

    # Configuring Auditing :
     - Spring Data JPA Auditing is not enabled by default.
        It must be enabled explicitly.

        Configuration generally involves:
            Enabling JPA Auditing in the application.
            Providing an Auditor (current user).
            Adding auditing annotations to the Entity.

    #cAdvantages
    - Automatically tracks record history.
    - Improves accountability.
    - Helps in debugging.
    - Useful for compliance and security.
    - Reduces manual coding.
    - Essential for enterprise applications.
*/