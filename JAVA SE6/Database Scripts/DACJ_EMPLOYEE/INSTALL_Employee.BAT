
osql -Usa -P -S%COMPUTERNAME% -iCreateEmployeeDatabase.sql
osql -Usa -P -S%COMPUTERNAME% -iCreateEmployeeUser.sql
osql -Uadministrator -P -S%COMPUTERNAME% -iCreateEmployeeObject.sql