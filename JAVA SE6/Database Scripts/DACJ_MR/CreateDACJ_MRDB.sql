/*      Install J2EE1_MR database             */

set nocount    on
USE master
declare @dttm varchar(55)
select  @dttm=convert(varchar,getdate(),113)
raiserror('Starting installation of J2EE1_MR Database at %s ....',1,1,@dttm) with nowait
--set dateformat mdy
GO
--sp_addlogin user1,null,J2EE1_MR
if exists (select * from sysdatabases where name='J2EE1_MR')
begin
  raiserror('Dropping existing J2EE1_MRdatabase ....',0,1)
  DROP database J2EE1_MR
end
GO

CHECKPOINT
go

raiserror('Creating J2EE1_MR database....',0,1)
go

   create DATABASE J2EE1_MR
GO

CHECKPOINT

GO

USE J2EE1_MR

GO

if db_name() <> 'J2EE1_MR'
   raiserror('Error in installJ2EE1_MR.SQL, "USE J2EE1_MR" failed!  Killing the SPID now.'
            ,22,127) with log

GO

execute sp_dboption 'J2EE1_MR','trunc. log on chkpt.' ,'true'
checkpoint


