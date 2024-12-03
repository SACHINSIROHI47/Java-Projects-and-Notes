create database nbjava2019
use nbjava2019

create table EmpDetails
(
  EMPLOYEE_ID VARCHAR(10) PRIMARY KEY NOT NULL,
  EMPLOYEE_NAME VARCHAR(15),
  AGE INT,
  DOB VARCHAR (20),
  DEP_NAME VARCHAR(25),
  JOINING_DATE VARCHAR(20),
  E_ADDRESS VARCHAR(20),
  MOBILE_NO VARCHAR(10),
  DEPARTMENT_ID VARCHAR(10),
  DESIGNATION VARCHAR(20),
  EMAIL_ID VARCHAR(20),
  BASIC_SALARY FLOAT,
  GENDER VARCHAR(15)
 )
 
 
 SELECT * FROM EmpDetails
 
 DROP TABLE EmpDetails
 
 
   CREATE TABLE EmpShift
   (
    EMPLOYEE_ID VARCHAR(10),
    SHIFT_TYPE VARCHAR(20),
    SHIFT_DATE DATETIME,
    SHIFT_ID VARCHAR(10)PRIMARY KEY not null,
    ATTENDANCE VARCHAR(10)
   )
    select SHIFT_ID from EmpShift
    SELECT * FROM EmpShift
    
    DROP TABLE EmpShift
    
    DELETE EmpShift
    
    select count(ATTENDANCE) from EmpShift where EMPLOYEE_ID='EMP001' and SHIFT_DATE>='2019-1-1' and SHIFT_DATE<='2019-12-31' and ATTENDANCE='Present'
    
    insert into EmpShift values('s001','EMP001','Day','20 nov')
    DELETE FROM EmpShift WHERE SHIFT_ID='sfsd'
    DROP TABLE EmpShift
    
     CREATE TABLE EmpExperiance
     (
      EMPLOYEE_ID VARCHAR(10),
      EXPERIANCE_ID VARCHAR(10)PRIMARY KEY NOT NULL,
      ORGANIZATION_NAME VARCHAR(20),
      E_FROM VARCHAR(10),
      DURATION VARCHAR(20),
      DESIGNATION VARCHAR(20),
      DEP_NAME VARCHAR(20),
      E_TO VARCHAR(20)
      )
      
      SELECT * FROM  EmpExperiance
      DROP TABLE EmpExperiance
      DELETE FROM EmpExperiance WHERE EXPERIANCE_ID='EXP004' 
      
     CREATE TABLE Salarymanagement
     (
      EMPLOYEE_ID VARCHAR(10),
      MONTHLY_SALARY VARCHAR(20),
      SALARY_MONTH VARCHAR(50),
      BONUS VARCHAR(20),
      HOUSING_ALLOWANCE BIT,
      CONVEYANCE_ALLOWANCE BIT,
      MEDICAL_ALLOWANCE BIT,
      OTHER_ALLOWANCE BIT,
      PF_DEDUCTION BIT,
      INSURANCE_DEDUCTION BIT,
      TOTAL_SALARY VARCHAR(20)
      )
      
      SELECT * FROM Salarymanagement
      DROP TABLE Salarymanagement
      
      DELETE FROM Salarymanagement WHERE MONTHLY_SALARY='4000'
      
      
 create table login
(
 lgin varchar(50) primary key not null,
 lgpwd varchar(50)not null
 )
 
 drop table login
 select * from login
 insert into login values (124,'admin')
 select lgin, lgpwd from login