/*      Install Employee database        */

set nocount    on
USE master
declare @dttm varchar(55)
select  @dttm=convert(varchar,getdate(),113)
raiserror('Starting installation of Employee Database at %s ....',1,1,@dttm) with nowait
--set dateformat mdy
GO
--sp_addlogin user1,null,Employee
if exists (select * from sysdatabases where name='Employee')
begin
  raiserror('Dropping existing Employee database ....',0,1)
  DROP database Employee
end
GO

CHECKPOINT
go

raiserror('Creating Employee database....',0,1)
go

   create DATABASE Employee
GO

CHECKPOINT

GO

USE Employee

GO

if db_name() <> 'Employee'
   raiserror('Error in installEmployee.SQL, "USE Employee" failed!  Killing the SPID now.'
            ,22,127) with log

GO

execute sp_dboption 'Employee','trunc. log on chkpt.' ,'true'
checkpoint


