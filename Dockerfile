FROM maven:3.6.1-jdk-11
VOLUME /main-app
COPY target/todo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]