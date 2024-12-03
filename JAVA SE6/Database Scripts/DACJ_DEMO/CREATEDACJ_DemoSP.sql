USE J2EE1_Demo
go

CREATE PROCEDURE authors_info 
AS 
SELECT au_id, au_lname, au_fname 
FROM authors 
WHERE city = 'Oakland' 
ORDER BY au_fname
GO

CREATE PROCEDURE authors_info_prmtz  @auth_id varchar(15) ,@auth_fname varchar(20) output, @auth_lname varchar(20) output, @auth_city varchar(20) output,@auth_state varchar(20) output
AS 
SELECT @auth_fname=au_fname, @auth_lname=au_lname, @auth_city=city, @auth_state=state
FROM authors
 WHERE au_id=@auth_id
GO