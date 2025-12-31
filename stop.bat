@echo off
title Microservices Shutdown
echo Stopping all running microservices...
taskkill /f /im java.exe
echo.
echo All services have been terminated.
pause