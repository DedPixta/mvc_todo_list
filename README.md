# To-Do List app
Task management application for Spring MVC technology practice

## Finished goals
- [x] Create a basic CRUD application with MVC architecture; 
- [x] Make a table to display all tasks using a template engine;
- [x] Package the application in a docker container;
- [x] Make it possible to run application and database through docker compose;

## Actions

| Command | Method | Address | Description |
| --- | --- | --- | --- |
| Add | POST | <app>/tasks | Create new task with description and status |
| Show | GET | <app>/tasks/{id} | Show task with ID, where {id} - id of the task which you want to see |
| Show all | GET | <app>/tasks | Show all existing in database tasks |
| Delete | DELETE | <app>/tasks/{id} | Delete task with ID, where {id} - id of the task which you want to delete |
| Edit | PUT | <app>/tasks/{id} | Edit task with ID, where {id} - id of the task which you want to change |



## To run project
1. Make sure you have docker installed and ports 8080, 3306 are free
2. Open a command line in the location where the application is installed and run the command:
```
docker compose up
```

## Technologies used
- Spring (Core, Data, MVC)
- Lombok
- Mapstruct
- Hibernate validator
- Logger (Log4j2, Slf4)
- Docker
- Tomcat
- MySQL
