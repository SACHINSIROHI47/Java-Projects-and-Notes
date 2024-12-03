USE Employee
GO

raiserror('Now at the create table section ....',0,1)
Go

raiserror('Creating employee_master....',0,1)
CREATE TABLE employee_master 
(
	emp_id varchar(5) constraint emp_id_pr primary key,
	emp_name varchar(15) NOT NULL,
	department_id varchar(5) NOT NULL,
	designation_id varchar(5) NOT NULL,
	emp_address varchar(50) NOT NULL,
	emp_city varchar(15) NOT NULL,
	emp_state varchar (15) NOT NULL,
	emp_phone varchar (15),
	emp_mobile varchar (15),
	emp_country varchar (15) NOT NULL,
	emp_pincode varchar (15)	
)
GO

raiserror('Creating department_master....',0,1)
CREATE TABLE department_master 
(
	department_id varchar(5) constraint dept_id_pr primary key,
	department_name varchar(15) NOT NULL,
	department_head varchar (15) NOT NULL	
)
GO

raiserror('Creating designation_master....',0,1)
CREATE TABLE designation_master 
(
	designation_id varchar(5) constraint desg_id_pr primary key,
	designation_name varchar(15) NOT NULL,
	leaves_allowed int NOT NULL
)
GO

raiserror('Creating employee_login....',0,1)
CREATE TABLE employee_login 
(
	emp_id varchar(5) constraint emp_id_login primary key,
	user_name varchar(15) NOT NULL,
	user_password varchar(15)	
)
GO

raiserror('Creating leave_employee....',0,1)
CREATE TABLE leave_employee 
(
	emp_id varchar(5) NOT NULL,
	from_date varchar(12) NOT NULL,
	to_date varchar(12) NOT NULL,
	number_of_days int NOT NULL,
	reason_for_leave varchar(100),
	financial_year int NOT NULL
)
GO

raiserror('Inserting  employee_master ....',0,1)
INSERT into employee_master values ('E0001','Peter Smith', 'DT01','DS01','589 Darwin Ln.','Oakland','CA','415 354-7128','9810166098','USA','94618')
INSERT into employee_master values ('E0002','John Michal', 'DT02','DS01','52 Darwin Ln.','Maxico','CA','434 312-7167','9123460983','USA','95623')
GO

raiserror('Inserting  department_master ....',0,1)
INSERT into department_master values ('DT01','Human Resource','John Smith')
INSERT into department_master values ('DT02','Sales','Peter Michal')
GO

raiserror('Inserting  designation_master ....',0,1)
INSERT into designation_master values ('DS01','HR Manager',50)
INSERT into designation_master values ('DS02','Project Manager',60)
GO

raiserror('Inserting  employee_login ....',0,1)
INSERT into employee_login values ('E0001','peters','password')
INSERT into employee_login values ('E0002','johns','password')
GO

raiserror('Inserting  leave_employee ....',0,1)
INSERT into leave_employee values ('E0001','2003/12/10','2003/12/22',12,'Personal',2003)
INSERT into leave_employee values ('E0001','2004/2/1','2004/2/1',1,'Official',2004)
INSERT into leave_employee values ('E0002','2003/12/14','2003/12/16',2,'Personal',2003)
GO