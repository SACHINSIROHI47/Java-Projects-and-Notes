USE J2EE3_DEMO
go


raiserror('Creating useraccount....',0,1)

CREATE TABLE [useraccount] (
	[id] [varchar] (3) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL ,
	[name] [varchar] (24) COLLATE SQL_Latin1_General_CP1_CI_AS NULL ,
	[address] [varchar] (30) COLLATE SQL_Latin1_General_CP1_CI_AS NULL ,
	[phoneno] [varchar] (24) COLLATE SQL_Latin1_General_CP1_CI_AS NULL 
) ON [PRIMARY]
GO




raiserror('Creating customer....',0,1)
CREATE TABLE [customer] (
	[balance] [float] NULL ,
	[id] [varchar] (20) COLLATE SQL_Latin1_General_CP1_CI_AS NULL 
) ON [PRIMARY]
GO


raiserror('Creating fund....',0,1)
CREATE TABLE [fund] (
	[cid] [varchar] (20) COLLATE SQL_Latin1_General_CP1_CI_AS NULL ,
	[amount] [float] NULL 
) ON [PRIMARY]
GO