
CREATE DATABASE BPB



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

DROP TABLE authors 

CREATE DATABASE SG

CREATE TABLE product
 (
	p_id INTEGER PRIMARY KEY,
	p_desc VARCHAR(25),
	p_rate FLOAT,
	p_qty INTEGER,
	unit_of_msr CHAR(6)
)

SELECT * FROM product


insert into authors values('A00001','smith','joon', '415 354-7128', '589 Darwin Ln.', 'Oakland', 'CA','94618')
insert into authors values('172-32-1176','Albert','Johnson', '415 534-8138', '598 Lake Park', 'Oakland', 'CA','94618')
insert into authors values('A00003','Enosh','joon', '415 354-7128', '589 Darwin Ln.', 'Orisa', 'CA','94618')
insert into authors values('172-32-1176','Aimee','Johnson', '415 534-8138', '598 Lake Park', 'London', 'CA','94618')



insert into product values('1001','Computer', '2500.00', '125', 'Number')
insert into product values('1002','Mobile', '500.00', '125', 'Number')
insert into product values('1003','Laptop', '12500.00', '25', 'Number')







