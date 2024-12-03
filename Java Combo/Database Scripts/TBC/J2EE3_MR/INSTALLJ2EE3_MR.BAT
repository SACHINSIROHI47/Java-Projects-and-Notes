
osql -Usa -P -S%COMPUTERNAME% -iCreateJ2EE3_MRDB.sql
osql -Usa -P -S%COMPUTERNAME% -iCreateUsersJ2EE3_MR.sql

for %%i in (1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30) do osql -Uuser%%i -P -S%COMPUTERNAME% -iCreateJ2EE3_MRObjects.sql

osql -Uadministrator -P -S%COMPUTERNAME% -iCREATEJ2EE3_MROBJECTS.sql
osql -Utest -Ppassword -S%COMPUTERNAME% -iCREATEJ2EE3_MROBJECTS.sql