USE J2EE1_MR
go



raiserror('Now at the create table section ....',0,1)
Go

raiserror('Creating J2EE1_MR_Authors....',0,1)
CREATE TABLE authors 
(
	au_id varchar(11) ,
	au_lname varchar(40),
	au_fname varchar(20),
	phone char(12),
	address varchar(40),
	city varchar(20),
	state char (2),
	zip char(5),
)
GO

raiserror('Creating J2EE1_MR_Product....',0,1)
CREATE TABLE product
 (
	p_id INTEGER,
	p_desc VARCHAR(25),
	p_rate FLOAT,
	p_qty INTEGER,
	unit_of_msr CHAR(6)
)
GO

raiserror('Creating J2EE1_MR_validate_user....',0,1)
CREATE TABLE validate_user
(
	username VARCHAR(15) PRIMARY KEY,
	password VARCHAR(15)
)
GO

raiserror('Creating J2EE1_MR_customer....',0,1)
CREATE TABLE customer
( 
	c_id INTEGER,
	c_name VARCHAR(20),
	c_address VARCHAR(50),
	c_phone VARCHAR(12)
)
GO

raiserror('Creating J2EE1_MR_EmpInfo....',0,1)
create table EmpInfo 
(
	fname VARCHAR(15),
	lname VARCHAR(15),
	address VARCHAR(20),
	city VARCHAR(12),
	phone VARCHAR(12),
	empsalary MONEY,
	designation VARCHAR(15),
	depttype VARCHAR(15)
)
GO

raiserror('Creating J2EE1_MR_Loan_Registration....',0,1)
CREATE TABLE Loan_Registration
(
	cLoan_Registration_id varchar(10),
	cFirst_name varchar(10),
	cLast_name varchar(10),
	cAddress varchar(60),
	cLoan_type varchar(10),
	cPhone varchar(12),
	mAnnual_income money,
	mAmount_applied money 
)
GO

raiserror('Creating J2EE1_MR_transactions....',0,1)
create table transactions
( 
	accountId char (10),
	amount float,
	transactionType char (1) 
)
GO

raiserror('Creating J2EE1_MR_Loan_Details....',0,1)
create table Loan_Details
(
	cLoan_id char(10),
	cLoan_Registration_id char(10),
	mLoan_amount money,
	mLoan_amount_repaid money,
	mBalance money,
	dDate_of_sanction datetime,
	intBal_no_installments int
)
GO

raiserror('Inserting  authors ....',0,1)
insert into authors values('A00001','smith','joon', '415 354-7128', '589 Darwin Ln.', 'Oakland', 'CA','94618')
go

raiserror('Inserting  customer ....',0,1)
insert into customer values('1001','John Smith', '589 Darwin Ln.', '415 354-7128')
insert into customer values('1002', 'Peter Smith', '589 Darwin Ln.', '415 354-7128')
go

raiserror('Inserting  product ....',0,1)
insert into product values('1001','Computer', '2500.00', '125', 'Number')
insert into product values('1002','Mobile', '500.00', '125', 'Number')
insert into product values('1003','Laptop', '12500.00', '25', 'Number')
go

raiserror('Inserting  validate_user ....',0,1)
insert into validate_user values('johns', 'password')
go

raiserror('Inserting  EmpInfo ....',0,1)
insert into EmpInfo values('John','smith', '589 Darwin Ln.', 'Oakland', '415 354-7128', 50000,'HR Manager', 'Human Resource')
go

raiserror('Inserting  transactions ....',0,1)
insert into transactions values('AA-00-01', '2500.00', 'D')
GO

raiserror('Inserting  Loan_Registration ....',0,1)
insert into Loan_Registration values('111-11-111','John', 'Smith', '589 Darwin Ln.', 'Personal', '415 354-7128', 250000, 250)
GO

raiserror('Inserting  Loan_Details ....',0,1)
insert into Loan_Details values('111-11', '111-11-111', 500000, 50000, 45000, '12/12/2003', 25)
GO




