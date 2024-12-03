USE J2EE3_MR
go


raiserror('Creating stocktable....',0,1)

CREATE TABLE [User_Login] (
	[stockId] [varchar] (50) ,
	[name] [varchar] (50) 
) ON [PRIMARY]
GO





raiserror('Creating library table....',0,1)

CREATE TABLE [library] (
	[id] [varchar] (3) ,
	[name] [varchar] (24) 
	[address] [varchar] (30) 
	[phoneno] [varchar] (24) 
) ON [PRIMARY]
GO