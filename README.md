# todo-REST-API-Spring-Boot
Simple To-Do Rest API using Spring Boot Framework. This API allow to ADD, DELETE, UPDATE and GET TODO items.

# Project Details
  1. SpringBoot Framework version 2.6.4
  2. Java JDK v11.0.14
  3. MySql Community Server 8.0.19
  4. Intellij IDEA 2019.3.5
  5. Postman v9.14.7

# README
1. Clone repository.
2. Open the project using your preferred IDE. (Ex. Intellij IDEA)
3. Make sure you have a Mysql server running.
4. Create a database with the following name: testdb, you can modify it in the application.properties file with this line: jdbc:mysql://localhost:3306/testdb?allowPublicKeyRetrieval=true&useSSL=false
5. Modify the username and pawsord in the file mention above with this line: spring.datasource.username=testUsername spring.datasource.password=testpasword
6. Run the application.
7. Test the API using Rest Client (Ex. Postman) by using Port No : 8080 (http://localhost:8080/api)
	
# Project Structure
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
