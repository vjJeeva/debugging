
@echo off
title Microservices Starter

echo Starting Eureka Server...
start cmd /k "cd eureka-server && mvnw spring-boot:run"
timeout /t 10
echo Starting API Gateway...
start cmd /k "cd api-gateway && mvnw spring-boot:run"

echo Starting Inventory Service...
start cmd /k "cd inventory-service && mvnw spring-boot:run"

echo Starting Order Service...
start cmd /k "cd order-service && mvnw spring-boot:run"

echo All services are launching!
pause