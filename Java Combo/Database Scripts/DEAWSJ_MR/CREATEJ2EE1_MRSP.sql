USE J2EE1_MR
go

CREATE PROCEDURE authors_info 
AS 
SELECT au_id, au_lname, au_fname 
FROM authors 
WHERE city = 'Oakland' 
ORDER BY au_fname
GO

CREATE PROCEDURE selectRow
AS BEGIN
SELECT * FROM customer
END
GO

CREATE PROCEDURE list_customer @id INT, @name VARCHAR(50) OUTPUT, @address VARCHAR(50) OUTPUT, @phone VARCHAR(15) OUTPUT
AS 
SELECT @name = c_name, @address = c_address, @phone = c_phone FROM   customer WHERE c_id = @id
GO