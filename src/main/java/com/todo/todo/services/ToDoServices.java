package com.todo.todo.services;
import com.todo.todo.model.ToDo;
import com.todo.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServices {
    @Autowired
    private ToDoRepository toDoRepository;

    //POST
    public ToDo addToDo(ToDo toDo) {
        System.out.println(toDo.toString());
        return toDoRepository.save(toDo);
    }

    //GET
    public List<ToDo> getToDo() {
        return toDoRepository.findAll();
    }
    public ToDo getToDoById(int id) {
        return toDoRepository.findById(id).orElse(null);
    }
    public ToDo getToDoByTitle(String title) {
        return toDoRepository.findByTitle(title);
    }

    //PUT
    public ToDo updateToDo(ToDo toDo, int id) {
        ToDo existingToDo = toDoRepository.findById(id).orElse(null);
        assert existingToDo != null;
        existingToDo.setDescription(toDo.getDescription());
        existingToDo.setTitle(toDo.getTitle());
        existingToDo.setStatus(toDo.getStatus());
        return toDoRepository.save(existingToDo);
    }

    //DELETE
    public String deleteToDo(int id) {
        toDoRepository.deleteById(id);
        return "Item " + id + " removed completed";
    }
}
