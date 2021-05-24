/* CREATE TABLE EMP(EmpID int PRIMARY KEY NOT NULL, EmpName varchar(30), Age int, Email varchar(50), Phone int); */

/* CREATE TABLE PROJECT(ProjectID int PRIMARY KEY NOT NULL,EmpID int, FOREIGN KEY (EmpID) REFERENCES EMP(EmpID), ProjectName varchar(30), ClientID int, ProjectStartDate Date); */

/* INSERT INTO EMP VALUES(2,'Himani',32,'himani@abc.com',981154321);
INSERT INTO EMP VALUES(3,'Ayushi',24,'ayushi@abc.com',981054321);
INSERT INTO EMP VALUES(4,'Hemanth',25,'hemanth@abc.com',981154321);
INSERT INTO EMP VALUES(5,'Swatee',26,'swatee@abc.com',941154321); */

/* ALTER TABLE PROJECT DROP FOREIGN KEY PROJECT_ibfk_1; */

/* INSERT INTO PROJECT VALUES(111,1,'Project1',3,'2019-04-21');
INSERT INTO PROJECT VALUES(222,2,'Project2',1,'2019-02-12');
INSERT INTO PROJECT VALUES(333,3,'Project3',5'2019-01-10');
INSERT INTO PROJECT VALUES(444,3,'Project4',2,'2020-08-12');
INSERT INTO PROJECT VALUES(555,5,'Project5',4,'2021-08-01');
INSERT INTO PROJECT VALUES(666,9,'Project6',1,'2021-07-12');
INSERT INTO PROJECT VALUES(777,7,'Project7',2,'2021-07-25');
INSERT INTO PROJECT VALUES(888,8,'Project8',3 ,'2021-08-20'); */

/* INNER JOIN */

/* SELECT EMP.EmpID, EMP.EmpName, PROJECT.ProjectID,PROJECT.ProjectName from EMP INNER JOIN PROJECT ON EMP.EmpID = PROJECT.EmpID; */

+-------+---------------+-----------+-------------+
| EmpID | EmpName       | ProjectID | ProjectName |
+-------+---------------+-----------+-------------+
|     1 | Vardhan Kumar |       111 | Project1    |
|     2 | Himani        |       222 | Project2    |
|     3 | Ayushi        |       444 | Project4    |
|     5 | Swatee        |       555 | Project5    |
+-------+---------------+-----------+-------------+


/* LEFT JOIN */

/* SELECT EMP.EmpID, EMP.EmpName, PROJECT.ProjectID,PROJECT.ProjectName from EMP LEFT JOIN PROJECT ON EMP.EmpID = PROJECT.EmpID; */

+-------+---------------+-----------+-------------+
| EmpID | EmpName       | ProjectID | ProjectName |
+-------+---------------+-----------+-------------+
|     1 | Vardhan Kumar |       111 | Project1    |
|     2 | Himani        |       222 | Project2    |
|     3 | Ayushi        |       444 | Project4    |
|     4 | Hemanth       |      NULL | NULL        |
|     5 | Swatee        |       555 | Project5    |
+-------+---------------+-----------+-------------+


/* RIGHT JOIN */

/* SELECT EMP.EmpID, EMP.EmpName, PROJECT.ProjectID,PROJECT.ProjectName from EMP RIGHT JOIN PROJECT ON EMP.EmpID = PROJECT.EmpID; */

+-------+---------------+-----------+-------------+
| EmpID | EmpName       | ProjectID | ProjectName |
+-------+---------------+-----------+-------------+
|     1 | Vardhan Kumar |       111 | Project1    |
|     2 | Himani        |       222 | Project2    |
|     3 | Ayushi        |       444 | Project4    |
|     5 | Swatee        |       555 | Project5    |
|  NULL | NULL          |       666 | Project6    |
|  NULL | NULL          |       777 | Project7    |
|  NULL | NULL          |       888 | Project8    |
+-------+---------------+-----------+-------------+


/* FULL JOIN */

SELECT * from EMP LEFT JOIN PROJECT ON EMP.EmpID = PROJECT.EmpID UNION ALL SELECT * from EMP RIGHT JOIN PROJECT ON EMP.EmpID = PROJECT.EmpID;

+-------+---------------+------+-----------------+-----------+-----------+-------+-------------+----------+------------------+
| EmpID | EmpName       | Age  | Email           | Phone     | ProjectID | EmpID | ProjectName | ClientID | ProjectStartDate |
+-------+---------------+------+-----------------+-----------+-----------+-------+-------------+----------+------------------+
|     1 | Vardhan Kumar |   22 | vardy@abc.com   | 987654321 |       111 |     1 | Project1    |        3 | 2019-04-21       |
|     2 | Himani        |   32 | himani@abc.com  | 981154321 |       222 |     2 | Project2    |        1 | 2019-02-12       |
|     3 | Ayushi        |   24 | ayushi@abc.com  | 981054321 |       444 |     3 | Project4    |        2 | 2020-08-12       |
|     4 | Hemanth       |   25 | hemanth@abc.com | 981154321 |      NULL |  NULL | NULL        |     NULL | NULL             |
|     5 | Swatee        |   26 | swatee@abc.com  | 941154321 |       555 |     5 | Project5    |        4 | 2021-08-01       |
|     1 | Vardhan Kumar |   22 | vardy@abc.com   | 987654321 |       111 |     1 | Project1    |        3 | 2019-04-21       |
|     2 | Himani        |   32 | himani@abc.com  | 981154321 |       222 |     2 | Project2    |        1 | 2019-02-12       |
|     3 | Ayushi        |   24 | ayushi@abc.com  | 981054321 |       444 |     3 | Project4    |        2 | 2020-08-12       |
|     5 | Swatee        |   26 | swatee@abc.com  | 941154321 |       555 |     5 | Project5    |        4 | 2021-08-01       |
|  NULL | NULL          | NULL | NULL            |      NULL |       666 |     9 | Project6    |        1 | 2021-07-12       |
|  NULL | NULL          | NULL | NULL            |      NULL |       777 |     7 | Project7    |        2 | 2021-07-25       |
|  NULL | NULL          | NULL | NULL            |      NULL |       888 |     8 | Project8    |        3 | 2021-08-20       |
+-------+---------------+------+-----------------+-----------+-----------+-------+-------------+----------+------------------+
