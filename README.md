# todo-REST-API-Spring-Boot
Simple To-Do Rest API using Spring Boot Framework. This API allow to ADD, DELETE, UPDATE and GET TODO items.

# README
## Instruction for running the app
1. Clone repository.
2. Make sure you have Docker and is running.
3. To run this application, go to terminal, run command: docker-compose up
4. Test the API using Rest Client (Ex. Postman) by using Port No : 8080 (http://localhost:8080/api)
5. To stop the application, run command: docker-compose down

## The compose docker image is also uploaded to docker hub
1. Run command: docker pull knee1997/todo-rest-api-spring-boot_app:1.0.0

## Aplication Demo using Postman
1. Add Item
- ![AddTODOItem](https://user-images.githubusercontent.com/68536911/156286396-a9d3b326-1cca-4bbd-8d43-7637cc07afd5.PNG)
2. Get ALL TODO List
- ![GetTODOList](https://user-images.githubusercontent.com/68536911/156286404-8a3ec97b-83c8-4578-beb1-5f6e24fae8f3.PNG)
3. Get ALL TODO list by using ID
- ![GetTODOListByID](https://user-images.githubusercontent.com/68536911/156286409-3dfd49bc-60dd-452a-8d78-88d99c53ced9.PNG)
4. Update Item
- ![UpdateTODO](https://user-images.githubusercontent.com/68536911/156286414-9f46fc6f-426b-4a25-9b07-cd2c862e989d.PNG)
5. Delete Item
- ![DeleteTODOItemByID](https://user-images.githubusercontent.com/68536911/156286415-ff41850e-05e7-4fc9-8faa-a4ba975509da.PNG)

## Project Details
  1. SpringBoot Framework version 2.6.4
  2. Java JDK v11.0.14
  3. MySql Community Server 8.0.19
  4. Intellij IDEA 2019.3.5
  5. Postman v9.14.7


## Project Structure
	/src
	-----/main
	----------/java
	-------------------/com.todo.todo
	---------------------------------/controller
	------------------------------------------------/ToDoController.java
	---------------------------------/mdoel
	------------------------------------------------/ToDo.java
	---------------------------------/repository
	------------------------------------------------/ToDoRepository.java
	---------------------------------/services
	------------------------------------------------/ToDoServices.java
	---------------------------------/TodoApplication.java
	----------/resources
	--------------------/application.properties

	/pom.xml
	/README.md
