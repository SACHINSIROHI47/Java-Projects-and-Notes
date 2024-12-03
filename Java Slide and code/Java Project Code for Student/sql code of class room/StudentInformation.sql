create database studentinfo
use studentinfo
create table login1
(
u_name varchar(50) not null,
u_pwd varchar(20)not null
)
select * from login1
insert into login1 values('hari','12345')
select u_name,u_pwd from login1

create table registraion
(
regid int primary key not null,
s_name varchar(50),
s_fname varchar(50),
gender varchar(10),
qual varchar(15),
addres varchar(100),
caste varchar(15)
)
select * from registraion
select regid,s_name from registraion where regid=101
select s_name from registraion where regid=101
select regid from registraion
delete from registraion where regid=106 
delete from registraion where regid='"+dl+"'
update registraion set s_fname='hari kumar',addres='delhi' where regid = 101
update registraion set s_fname='fnmm',addres='add' where regid ='101'