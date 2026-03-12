Problem Statement: Build a Database Connection Manager

You are developing an application that interacts with a database.
Creating a database connection manager is expensive, and the application should reuse the same connection manager throughout its lifecycle.

Requirement

The system should ensure that only one instance of the DatabaseConnectionManager class exists in the application.

All services in the application should access the same instance.

Problem

If developers create objects normally using:

DatabaseConnectionManager db1 = new DatabaseConnectionManager();
DatabaseConnectionManager db2 = new DatabaseConnectionManager();

Then multiple objects will be created.

Example:

System.out.println(db1 == db2); // false

This can cause problems such as:

Multiple database connection managers

Resource wastage

Inconsistent state across the application

Solution

To ensure that only one object is created and shared globally, we implement the Singleton Design Pattern.