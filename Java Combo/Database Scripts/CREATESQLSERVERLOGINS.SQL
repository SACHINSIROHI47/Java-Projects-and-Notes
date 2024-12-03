use master
go
exec sp_dropuser 'administrator'
go

use master
go

sp_dropsrvrolemember 'administrator', 'administrator'
go




exec 	sp_droplogin user1
exec 	sp_droplogin user2
exec 	sp_droplogin user3
exec 	sp_droplogin user4
exec 	sp_droplogin user5
exec 	sp_droplogin user6
exec 	sp_droplogin user7
exec 	sp_droplogin user8
exec 	sp_droplogin user9
exec 	sp_droplogin user10
exec 	sp_droplogin user11
exec 	sp_droplogin user12
exec 	sp_droplogin user13
exec 	sp_droplogin user14
exec 	sp_droplogin user15
exec 	sp_droplogin user16
exec 	sp_droplogin user17
exec 	sp_droplogin user18
exec 	sp_droplogin user19
exec 	sp_droplogin user20
exec 	sp_droplogin user21
exec 	sp_droplogin user22
exec 	sp_droplogin user23
exec 	sp_droplogin user24
exec 	sp_droplogin user25
exec 	sp_droplogin user26
exec 	sp_droplogin user27
exec 	sp_droplogin user28
exec 	sp_droplogin user29
exec 	sp_droplogin user30
exec 	sp_droplogin administrator
exec 	sp_droplogin test

exec 	sp_addlogin user1,user1
exec 	sp_addlogin user2,user2
exec 	sp_addlogin user3,user3
exec 	sp_addlogin user4,user4
exec 	sp_addlogin user5,user5
exec 	sp_addlogin user6,user6
exec 	sp_addlogin user7,user7
exec 	sp_addlogin user8,user8
exec 	sp_addlogin user9,user9
exec 	sp_addlogin user10,user10
exec 	sp_addlogin user11,user11
exec 	sp_addlogin user12,user12
exec 	sp_addlogin user13,user13
exec 	sp_addlogin user14,user14
exec 	sp_addlogin user15,user15
exec 	sp_addlogin user16,user16
exec 	sp_addlogin user17,user17
exec 	sp_addlogin user18,user18
exec 	sp_addlogin user19,user19
exec 	sp_addlogin user20,user20
exec 	sp_addlogin user21,user21
exec 	sp_addlogin user22,user22
exec 	sp_addlogin user23,user23
exec 	sp_addlogin user24,user24
exec 	sp_addlogin user25,user25
exec 	sp_addlogin user26,user26
exec 	sp_addlogin user27,user27
exec 	sp_addlogin user28,user28
exec 	sp_addlogin user29,user29
exec 	sp_addlogin user30,user30
exec 	sp_addlogin administrator,administrator
exec    sp_addlogin test,password



use model
go
exec	sp_adduser administrator

use master
go

sp_addsrvrolemember 'administrator', 'administrator'