/*

    # Introduction to Microservices Monitoring 
    - Monitoring is the process of continuously checking the health and performance of Microservices
    - It helps detect issues before users do
    Why do we need Monitoring?
     Without Monitoring
        Payment Service
            ↓
          Slow
            ↓
        Nobody Knows

        Users complain first.

     With Monitoring
        Payment Service
            ↓
        CPU High
            ↓
        Alert Generated
            ↓
        Engineer Fixes Problem

        Problem detected before users complain.

    Real-Life Analogy
     Hospital ICU
        Doctors continuously monitor:
            Heart Rate
            Oxygen
            Blood Pressure

        Similarly, Microservices are continuously monitored.

    Advantages
        Detect failures early
        Better performance
        High Availability
        Faster debugging

    # Spring Boot Actuator :
    - Spring Boot Actuator provides production-ready endpoints to monitor a Spring Boot application.
    - It gives insights into the application's internals.

    Why do we need Actuator?
     Without Actuator
        Developers manually collect
            Memory
            Health
            CPU
            Threads

        Very difficult.

     With Actuator
        Everything is available through endpoints.

    # Prometheus :
    - Prometheus is a powerful monitoring and alerting toolkit.
    - It collects metrics from applications and stores them in a time-series database.
    - It is widely used in microservices architectures.

    Why do we need Prometheus?
        Actuator provides metrics.
        But
        Who stores them?
        Prometheus.

    How does Prometheus work?
     Prometheus periodically pulls (scrapes) metrics from applications.
        It does not wait for applications to send them.

     Real-Life Analogy
        Attendance Teacher
        Instead of students reporting attendance, the teacher checks attendance periodically.
        Prometheus works the same way.

    Advantages
        Time-Series Database
        Automatic Metric Collection
        Fast Queries
        Open Source

    # Grafana :
    - Grafana is a visualization tool that works with Prometheus.
    - It displays metrics collected by Prometheus in beautiful dashboards.
    - It helps understand system behavior easily.

    Why do we need Grafana?
        Prometheus stores data.
        But
        How do we see it?

        Grafana = Visualizer

    Real-Life Analogy
        Data in Excel
        Data in Graphs

        Grafana = Graphs

    Advantages
        Beautiful Dashboards
        Multiple Data Sources
        Real-Time Updates
        Easy to Use

    # Application Metrics :
    - Application Metrics measure the health and performance of the application itself.
        Common Metrics
            Request Count
            Response Time
            Error Rate
            Active Sessions
            Thread Count
            Database Connections

    Real-Life Analogy
     Factory
        Factory Manager tracks
            Production
            Defects
            Working Machines

        Similarly, developers monitor applications.

     Advantages
        Performance Analysis
        Capacity Planning
        Faster Debugging

    # System Metrics :
    - System Metrics measure the health and performance of the underlying system.
        Common Metrics
            CPU Usage
            Memory Usage
            Disk I/O
            Network I/O
            Load Average

    Real-Life Analogy
     Hospital
        Doctors check
            Heart Rate
            Temperature
            Blood Pressure

        Similarly, system metrics check
            CPU
            Memory
            Disk

    Advantages
        Resource Management
        Performance Tuning
        Predictive Maintenance
*/