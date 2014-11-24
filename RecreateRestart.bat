@echo off
set server_drive=E:
set develop_drive=C:
set server_dir=e:\apache-tomcat-6.0.37\bin
set project_war_file=c:\Users\aleksander\workspace\workspace_indigo\CatHouse\CatHouse.war
set project_path=c:\Users\aleksander\workspace\workspace_indigo\CatHouse
set server_war_file_path=e:\apache-tomcat-6.0.37\webapps\CatHouse.war
set server_unpacked_war=e:\apache-tomcat-6.0.37\webapps\CatHouse
set server_war_path=e:\apache-tomcat-6.0.37\webapps\


echo rewrite this 

 
 echo ========================================================
 echo *********Starting build %date% : %time%********
 echo ========================================================
 echo *
 echo *
 call rebuild.bat
 echo *
 echo *
 echo ========================================================
 echo *********Build ended %date% : %time%********
 echo ========================================================



rem go to server dir to stop it
rem cd %server_dir%
echo stop server []
%server_drive%
cd %server_dir%
call shutdown.bat
pause Waite stopring
echo .
echo .
rem delete old project files and copy new
echo deleting [ %server_war_file_path% ] from server
del /F/Q %server_war_file_path%
echo deleting [%server_unpacked_war%] from server
rmdir /S/Q %server_unpacked_war%
echo Coping war from [%project_war_file%] to [%server_war_path%]
xcopy %project_war_file% %server_war_path% /F
echo .
echo .
rem start server

call startup.bat
%develop_drive%
cd %project_path%


echo ========================================================
echo * * * * Files were successfully upload to server * * * * 
echo            [ %date% : %time%]
echo ========================================================
