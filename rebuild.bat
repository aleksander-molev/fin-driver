echo Start rebuild

del /q fin-driver.war
call ant clean
call ant 
call ant build-war

echo rebuild ended