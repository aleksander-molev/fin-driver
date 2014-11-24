echo Start rebuild

del /q CatHouse.war
call ant clean
call ant 
call ant build-war

echo rebuild ended