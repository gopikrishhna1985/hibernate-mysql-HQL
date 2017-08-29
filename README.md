# hibernate-mysql-HQL
A Simple Hibernate MySQL example explaining HQL features and Query Object

Hibernate Query Language (CRUD) HQL - allows the user to directly write query on the entity object itself instead of using DB names... 
Class name for table name and property name for column name 

Uses Query to create queries… Named parameters or Positional Parameters can be used to pass params to the Query 

Query queryObj = sessionObj.createQuery("from Employee where employeeId = :empId");
