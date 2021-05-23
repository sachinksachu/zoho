/* WHERE */
/* SELECT Emp_Name, Country from EMPLOYEE WHERE Age > 45; */

/* ORDER BY */
/* used to specify the sort order of the result set. */
/* SELECT * FROM EMPLOYEE WHERE Country = "Pakistan" ORDER BY Age DESC; */

/* GROUP BY */
/* groups rows that have the same values into summary rows  */
/* The GROUP BY statement is often used with aggregate functions (COUNT(), MAX(), MIN(), SUM(), AVG()) to group the result-set */
/* SELECT COUNT(Country) AS PLAYERS_COUNT, Country FROM EMPLOYEE GROUP BY Country; */
/* +---------------+-----------+
| PLAYERS_COUNT | Country   |
+---------------+-----------+
|             4 | INDIA     |
|             3 | AUSTRALIA |
|             3 | PAKISTAN  |
|             3 | NEWZELAND |
|             2 | ENGLAND   |
+---------------+-----------+ */
/* SELECT MAX(Age),Country FROM EMPLOYEE GROUP BY Country; */

/* HAVING */
/* condition is used to specify criteria when working using the GROUP BY keyword. */
/* HAVING clause was added to SQL because the WHERE keyword cannot be used with aggregate functions. */
/* SELECT COUNT(Jersey), Country FROM EMPLOYEE GROUP BY Country HAVING COUNT(Jersey) > 2; */

/* LIKE */
/* operator is used in a WHERE clause to search for a specified pattern in a column. */
/* There are two wildcards often used in conjunction with the LIKE operator: '%' and '_' */
/* The percent sign (%) represents zero, one, or multiple characters */
/* The underscore sign (_) represents one, single character */

/* name starts with 's' */
/* SELECT * FROM EMPLOYEE WHERE Emp_Name LIKE 's%'; */

/* name starts with any character and second char 'a' */
/* SELECT * FROM EMPLOYEE WHERE Emp_Name LIKE '_a%'; */

/* name must starts with "s" and ends with 'n'  */
/* SELECT * FROM EMPLOYEE WHERE Emp_Name LIKE 's%n'; */

/* name must contains atleast 2 char */
/* SELECT * FROM EMPLOYEE WHERE Emp_Name LIKE '__%'; */