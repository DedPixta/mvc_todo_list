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
1. Download the project and extract it
2. Make sure you have installed docker and ports 8080, 3306 are free
3. Open a command line in the location where the application is installed and run the command:
```
docker compose up
```
4. The application will download all dependencies and create a docker container. Docker container will be launched automatically
5. After the successful completion of the previous point, the application will be available at the link:
```
http://localhost:8080/todo/tasks
```

![image](https://user-images.githubusercontent.com/101488434/222964221-319c05be-6491-4c40-9590-8270fb3b3c20.png)

## Technologies used
- Spring (Core, Data, MVC)
- Thymeleaf
- Liquibase
- Lombok
- Mapstruct
- Hibernate validator
- Logger (Log4j2, Slf4)
- Docker
- Tomcat
- MySQL
