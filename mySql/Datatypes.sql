/* CREATE TABLE STRING_TYPES(Gender char(6), Name varchar(25), Address text , Married enum('yes','no')) */
/* INSERT INTO STRING_TYPES VALUES('female', 'Hima Karen Mathew', 'SK No.14 JSO Building,  Rajaji Nagar, Banglore Pin 645798', 'yes'); */

/* +--------+-------------------+-----------------------------------------------------------+---------+
| Gender | Name              | Address                                                   | Married |
+--------+-------------------+-----------------------------------------------------------+---------+
| female | Hima Karen Mathew | SK No.14 JSO Building,  Rajaji Nagar, Banglore Pin 645798 | yes     |
+--------+-------------------+-----------------------------------------------------------+---------+ */


/* CREATE TABLE NUMERIC_TYPES(age tinyint,Population int, net_worth bigint, growth float, double_value double, decimal_value decimal, active boolean); */
/* ALTER TABLE NUMERIC_TYPES ADD COLUMN (Population int, net_worth bigint, growth float, double_value double, decimal_value decimal, active boolean) */
/* INSERT INTO NUMERIC_TYPES VALUES(18, 700000000, 1345435675675434562, 25.78, 56.654456789086755,88.87653432123456543456,false); */

/* +------+------------+---------------------+--------+-------------------+---------------+--------+
| age  | Population | net_worth           | growth | double_value      | decimal_value | active |
+------+------------+---------------------+--------+-------------------+---------------+--------+
|  127 |       NULL |                NULL |   NULL |              NULL |          NULL |   NULL |
|  127 |  700000000 | 1345435675675434562 |  25.78 | 56.65445678908676 |            89 |      1 |
+------+------------+---------------------+--------+-------------------+---------------+--------+ */

/* CREATE TABLE DATETIME(Today Date, CurrentTime Time, CurrentDateTime DateTime, CurrentTimeStamp TimeStamp, CurrentYear Year) */

/* INSERT INTO DATETIME VALUES('2021-05-24', '10:48:44', '2021-05-24 10:49:15', '2021-05-24 10:49:15', '2021'); */

/* +------------+-------------+---------------------+---------------------+-------------+
| Today      | CurrentTime | CurrentDate         | CurrentTimeStamp    | CurrentYear |
+------------+-------------+---------------------+---------------------+-------------+
| 2021-05-24 | 10:48:44    | 2021-05-24 10:49:15 | 2021-05-24 10:49:15 |        2021 |
+------------+-------------+---------------------+---------------------+-------------+ */
