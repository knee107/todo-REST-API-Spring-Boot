package com.todo.todo.controller;
import com.todo.todo.model.ToDo;
import com.todo.todo.services.ToDoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")

public class ToDoController {
    @Autowired
    private ToDoServices toDoServices;

    //POST
    @PostMapping("/addToDo")
    public ToDo addToDo(@RequestBody ToDo toDo) {
        return toDoServices.addToDo(toDo);
    }

    //GET
    @GetMapping("/toDo")
    public List<ToDo> getAllToDo() {
        return toDoServices.getToDo();
    }
    @GetMapping("/toDoById/{id}")
    public ToDo findToDoById(@PathVariable int id) {
        return toDoServices.getToDoById(id);
    }
    @GetMapping("/toDoByTitle/{title}")
    public ToDo findToDoByTitle(@PathVariable String title) {
        return toDoServices.getToDoByTitle(title);
    }

    //PUT
    @PutMapping("/update/{id}")
    public ToDo updateToDo(@RequestBody ToDo toDo, @PathVariable int id)
    {
        System.out.println("UPDATED");
        return toDoServices.updateToDo(toDo, id);
    }

    //DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteToDo(@PathVariable int id) {
        return toDoServices.deleteToDo(id);
    }
}
