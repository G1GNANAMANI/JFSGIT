CREATE DATABASE BOTREE;
USE BOTREE;
CREATE TABLE EMPLOYEE (EMPLOYEE_ID INT , EMPLOYEE_NAME CHAR(50), EMPLOYEE_SALARY INT, EMPLOYEE_MOB_NO INT);
INSERT INTO EMPLOYEE(EMPLOYEE_ID, EMPLOYEE_NAME,EMPLOYEE_SALARY) VALUES('1','GNANAMANI','15000');
INSERT INTO EMPLOYEE(EMPLOYEE_ID, EMPLOYEE_NAME,EMPLOYEE_SALARY) VALUES('2','SARVESH','15000');
INSERT INTO EMPLOYEE(EMPLOYEE_ID, EMPLOYEE_NAME,EMPLOYEE_SALARY) VALUES('3','SREEKANTH','15000');
INSERT INTO EMPLOYEE(EMPLOYEE_ID, EMPLOYEE_NAME,EMPLOYEE_SALARY) VALUES('4','PAVITHRA','16000');
INSERT INTO EMPLOYEE(EMPLOYEE_ID, EMPLOYEE_NAME,EMPLOYEE_SALARY) VALUES('5','MALAVIKA','16000');
SELECT * FROM EMPLOYEE;
CREATE TABLE EMPLOYEE1
(EMP_ID CHAR(5) NOT NULL PRIMARY KEY, 
EMP_NAME VARCHAR(100) NOT NULL
);
INSERT INTO EMPLOYEE1 VALUES (8,'KAVIYA');
INSERT INTO EMPLOYEE1 VALUES (9,'SUDHA');
SELECT * FROM EMPLOYEE1;
DROP TABLE  EMPLOYEE2;
-- FOREIGN KEY
CREATE TABLE EMPLOYEE2(
ID CHAR(5) NOT NULL PRIMARY KEY,
EMP_NAME VARCHAR(50) NOT NULL,
EMP_ID CHAR(5),
FOREIGN KEY (EMP_ID) REFERENCES EMPLOYEE1 (EMP_ID)
);
DESCRIBE EMPLOYEE1;
DESCRIBE EMPLOYEE2;
-- ASS-2
USE BOTREE;
CREATE TABLE HUSKY (F_NAME CHAR(50), L_NAME CHAR(50));
INSERT INTO HUSKY (F_NAME,L_NAME) VALUES('GNANAMANI','CHIDAMBARAM');
INSERT INTO HUSKY (F_NAME,L_NAME) VALUES('MADHUJA','RAVI');
INSERT INTO HUSKY (F_NAME,L_NAME) VALUES('PAVITHRA','NATARAJAN');
INSERT INTO HUSKY (F_NAME,L_NAME) VALUES('KAVIYA','THILLAINATHAN');
INSERT INTO HUSKY (F_NAME,L_NAME) VALUES('MALAVIKA','MOHAN');
SELECT * FROM HUSKY;
CREATE TABLE HUSKY1
(F_NAME CHAR(50) NOT NULL PRIMARY KEY, 
L_NAME VARCHAR(100) NOT NULL
);                    
INSERT INTO HUSKY1 VALUES ('PREETHI','CHAUHAN');
INSERT INTO HUSKY1 VALUES ('SUDHA','CHANDRAN');                  
SELECT * FROM HUSKY1;
DROP TABLE  HUSKY2;
-- FOREIGN KEY
CREATE TABLE HUSKY2(
FNAME CHAR(50) NOT NULL PRIMARY KEY,
L_NAME VARCHAR(50) NOT NULL,
F_NAME CHAR(50),
FOREIGN KEY (F_NAME) REFERENCES HUSKY1 (L_NAME)
);
DESCRIBE HUSKY1;
DESCRIBE HUSKY2;