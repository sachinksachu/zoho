/* CREATE DATABASE MYSQL_DB;

CREATE TABLE EMPLOYEE(Emp_Id int, Emp_Name varchar(100), Gender varchar(10), City varchar(255), Country varchar(100));

INSERT INTO EMPLOYEE VALUES(17,'AKTHAR','MALE',"KARACHI","PAKISTAN",51);
OR
INSERT INTO EMPLOYEE(Jersey,Emp_Name,Gender,City,Country,Age) VALUES(12,'BUTLER','MALE',"LORDS","ENGLAND",37);


ALTER TABLE EMPLOYEE ADD Age int;
ALTER TABLE EMPLOYEE RENAME COLUMN Jersey_No to Jersey;

UPDATE EMPLOYEE SET Age = 51 WHERE Jersey =12;

[ ORDER BY ] used to specify the sort order of the result set.
sort the result-set in ascending or descending order.
SELECT * from EMPLOYEE ORDER BY Age ASC;
This means that it orders by Age, but if some rows have the same Age, it orders them by Jersey:
SELECT * from EMPLOYEE ORDER BY Age ASC ,Jersey DESC; */

/* [GROUP BY] groups rows that have the same values into summary rows */


-- [ DISTINCT ] selects only the DISTINCT values in 'Country column'
/* SELECT DISTINCT Country FROM EMPLOYEE; */

-- [ HAVING ] condition is used to specify criteria when working using the GROUP BY keyword.




-- /home/user/Documents/zoho/mySql/notes
