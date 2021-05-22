-- CREATE DATABASE MYSQL_DB;

-- CREATE TABLE EMPLOYEE(Emp_Id int, Emp_Name varchar(100), Gender varchar(10), City varchar(255), Country varchar(100));

-- INSERT INTO EMPLOYEE VALUES(10,'SACHIN','MALE',"KANNUR","INDIA");
-- OR
-- INSERT INTO EMPLOYEE(Emp_Id,Emp_Name,Gender,City,Country) VALUES(13,'SEHWAG','MALE',"DELHI","INDIA");

-- ALTER TABLE EMPLOYEE ADD Age int;
-- ALTER TABLE EMPLOYEE RENAME COLUMN Jersey_No to Jersey;

-- UPDATE EMPLOYEE SET Age = 51 WHERE Jersey =12;

-- ORDER BY
/* sort the result-set in ascending or descending order. */
-- SELECT * from EMPLOYEE ORDER BY Age ASC;

/*This means that it orders by Age, but if some rows have the same Age, it orders them by Jersey:*/

SELECT * from EMPLOYEE ORDER BY Age ASC ,Jersey DESC;



-- /home/user/Documents/zoho/mySql/notes
