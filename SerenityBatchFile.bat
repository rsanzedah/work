set MyProject=C:\Test Report
cd %MyProject%
call mvn clean verify serenity:aggregate -Dtest=IntegrationReport
cd C:\Program Files\Java\jdk1.8.0_112\bin\
call java -jar "C:\Test Report\SendEmail.jar"

