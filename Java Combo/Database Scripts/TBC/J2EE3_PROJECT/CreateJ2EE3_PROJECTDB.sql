/*      Install J2EE3_PROJECT database             */

set nocount    on
USE master
declare @dttm varchar(55)
select  @dttm=convert(varchar,getdate(),113)
raiserror('Starting installation of J2EE3_PROJECT Database at %s ....',1,1,@dttm) with nowait
--set dateformat mdy
GO
--sp_addlogin user1,null,J2EE3_PROJECT
if exists (select * from sysdatabases where name='J2EE3_PROJECT')
begin
  raiserror('Dropping existing J2EE3_PROJECT database ....',0,1)
  DROP database J2EE3_PROJECT
end
GO

CHECKPOINT
go

raiserror('Creating J2EE3_PROJECT database....',0,1)
go

   create DATABASE J2EE3_PROJECT
GO

CHECKPOINT

GO

USE J2EE3_PROJECT

GO

if db_name() <> 'J2EE3_PROJECT'
   raiserror('Error in installJ2EE3_PROJECT.SQL, "USE J2EE3_PROJECT" failed!  Killing the SPID now.'
            ,22,127) with log

GO

execute sp_dboption 'J2EE3_PROJECT','trunc. log on chkpt.' ,'true'
checkpoint


