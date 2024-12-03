
osql -Usa -Ppassword -S%COMPUTERNAME% -iCreateJ2EE3_DEMODB.sql
osql -Usa -Ppassword -S%COMPUTERNAME% -iCreateUsersJ2EE3_DEMO.sql

for %%i in (1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30) do osql -Uuser%%i -Puser%%i -S%COMPUTERNAME% -iCreateJ2EE3_DEMOObjects.sql

osql -Uadministrator -Padministrator -S%COMPUTERNAME% -iCREATEJ2EE3_DEMOOBJECTS.sql
osql -Utest -Ppassword -S%COMPUTERNAME% -iCREATEJ2EE3_DEMOOBJECTS.sql