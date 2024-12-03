/*      Install J2EE3_MR database             */

set nocount    on
USE master
declare @dttm varchar(55)
select  @dttm=convert(varchar,getdate(),113)
raiserror('Starting installation of J2EE3_MR Database at %s ....',1,1,@dttm) with nowait
--set dateformat mdy
GO
--sp_addlogin user1,null,J2EE3_MR
if exists (select * from sysdatabases where name='J2EE3_MR')
begin
  raiserror('Dropping existing J2EE3_MRdatabase ....',0,1)
  DROP database J2EE3_MR
end
GO

CHECKPOINT
go

raiserror('Creating J2EE3_MR database....',0,1)
go

   create DATABASE J2EE3_MR
GO

CHECKPOINT

GO

USE J2EE3_MR

GO

if db_name() <> 'J2EE3_MR'
   raiserror('Error in installJ2EE3_MR.SQL, "USE J2EE3_MR" failed!  Killing the SPID now.'
            ,22,127) with log

GO

execute sp_dboption 'J2EE3_MR','trunc. log on chkpt.' ,'true'
checkpoint


