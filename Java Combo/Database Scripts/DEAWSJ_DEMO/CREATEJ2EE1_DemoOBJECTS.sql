USE J2EE1_Demo
go



raiserror('Now at the create table section ....',0,1)
Go

raiserror('Creating J2EE1_Demo_Authors....',0,1)
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

raiserror('Creating J2EE1_Demo_Product....',0,1)
CREATE TABLE product
 (
	p_id INTEGER,
	p_desc VARCHAR(25),
	p_rate FLOAT,
	p_qty INTEGER,
	unit_of_msr CHAR(6)
)
GO

 raiserror('Creating J2EE1_Demo_transactions....',0,1)
create table transactions
( 
	accountId char (10),
	amount float,
	transactionType char (1) 
)
GO


CREATE TABLE publishers (
	pub_id char (4)  Primary key ,
	pub_name varchar (40) ,
	city varchar (20) ,
	state char (2)  ,
	country varchar (30) 
)
GO

raiserror('Inserting  product ....',0,1)
insert into publishers values('0736','New Moon Books', 'Boston', 'MA', 'USA')
insert into publishers values('0877','Binnet & Hardley', 'Washington', 'DC', 'USA')
insert into publishers values('1389','Algodata Infosystems', 'Berkeley', 'CA', 'USA')
go

raiserror('Inserting  authors ....',0,1)
insert into authors values('A00001','smith','joon', '415 354-7128', '589 Darwin Ln.', 'Oakland', 'CA','94618')
insert into authors values('172-32-1176','Albert','Johnson', '415 534-8138', '598 Lake Park', 'Oakland', 'CA','94618')
go

raiserror('Inserting  product ....',0,1)
insert into product values('1001','Computer', '2500.00', '125', 'Number')
insert into product values('1002','Mobile', '500.00', '125', 'Number')
insert into product values('1003','Laptop', '12500.00', '25', 'Number')
go


raiserror('Inserting  transactions ....',0,1)
insert into transactions values('AA-00-01', '2500.00', 'D')
GO




