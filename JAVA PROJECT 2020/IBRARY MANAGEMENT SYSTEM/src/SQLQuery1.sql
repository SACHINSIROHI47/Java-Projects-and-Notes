create database java2019

use java2019

create table logn
(
lgin int primary key not null,
lgpwd varchar(50) not null
)

select * from logn
insert into logn values(101,'123')


create table record

(
sreg int primary key not null,
sname varchar(60),
smark varchar(50),
sfees varchar(10),
cname varchar(100),
sdura varchar(10),
reslt varchar(10),
sgender varchar(100),
spwd varchar(40),
saddrs varchar(100)
)


select * from record

drop table record


/////////////////////////////////////////////////////////////////////////
use java2019

create table jLogin
(
UserID varchar(10) primary key not null,
User_Password varchar(20),
U_Name varchar(20),
Addrx varchar(200),
U_Mail varchar(64),
U_con varchar(11),
U_Security varchar(100),
U_Anx varchar(20)
)
select * from jLogin
SELECT * FROM jLogin WHERE UserID='UR00001'

insert into jLogin(UserID,User_Password) values('AD00001','priyanka')

drop table jLogin

s_no int identity(1,1) not null    primary key  clustered,
BOOK_ID as 'BID'+ right('00000000' + cast (s_no as varchar(8)),8)persisted not null,
select top 1 BOOK_ID from bookentries order by BOOK_ID desc

select last * BOOK_ID from bookentries order by BOOK_ID asc

create table bookentries
(
BOOK_ID varchar(10) primary key not null,
BOOK_NAME varchar(40),
AUTHOR varchar(20),
EDITION varchar(15),
BOOK_SUBJECT varchar(15),
PAGES int,
PRICE float,
AVAILABLE varchar(15)
)

select * from bookentries
select BOOK_ID from bookentries order by BOOK_ID asc

drop table bookentries

insert into bookentries

insert into bookentries values('dsd','sddsa','dsa','dsd',3433,4.33,'3')



create table newmember
(
MEMBER_ID char(8) primary key not null,
NAME varchar(20),
GENDER varchar(8),
DATE_OF_BIRTH varchar(20),
EMAIL_ID varchar(64),
CONTACT varchar(12),
FATHER_NAME varchar(20),
M_ADDRESS varchar(100),
)

select * from newmember order by MEMBER_ID asc
drop table newmember
select * from newmember where MEMBER_ID ='LMB00001'


select top 1 MEMBER_ID from newmember order by MEMBER_ID desc


select COUNT(BORROW_NO) from b_BRW WHERE B_STATUS='RETURN' AND MEMBER_ID='hgfh6776'


select * from b_BRW
select COUNT(BORROW_NO) from b_BRW WHERE MEMBER_ID= 'LMB00001'

select RETURN_NO from b_BRW order by RETURN_NO asc


select BORROW_NO from b_BRW order by BORROW_NO asc

select * from b_BRW order by BORROW_NO asc

select DISTINCT MEMBER_ID from b_BRW
select MEMBER_ID from b_BRW

select * from b_BRW where B_STATUS = 'RETURN' AND MEMBER_ID ='hgfh677n'


drop table b_BRW

create table b_BRW
(
BORROW_NO int PRIMARY KEY NOT NULL,
MEMBER_ID CHAR(8) FOREIGN KEY REFERENCES newmember(MEMBER_ID),
BOOK_ID varchar(10) FOREIGN KEY REFERENCES bookentries(BOOK_ID),
ISSUE VARCHAR(15),
B_RETURN VARCHAR(15),
B_STATUS VARCHAR(10)NOT NULL
)
select * from b_BRW where B_STATUS= 'ISSUED'

select DISTINCT BORROW_NO,MEMBER_ID,BOOK_ID from b_BRW order by BORROW_NO asc
select * from b_BRW where BOOK_ID ='LMU00005'

select BOOK_NAME from bookentries where BOOK_ID ='LMU00008'


SELECT b_BRW.BORROW_NO,MEMBER_ID,BOOK_ID,ISSUE,ACTUAL_RETURN FROM b_BRW,r_RTN WHERE b_BRW.BOOK_ID


create table r_RTN
(
RETURN_NO int PRIMARY KEY NOT NULL,
BOOK_ID varchar(10),
ACTUAL_RETURN VARCHAR(15),
EXTRA_DAYS INT ,
FINE float
)
SELECT * FROM r_RTN
DROP TABLE r_RTN


select RETURN_NO from r_RTN order by RETURN_NO asc
