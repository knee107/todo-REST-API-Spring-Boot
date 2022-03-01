package com.todo.todo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.todo.todo.model.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer>{
    ToDo findByTitle(String title);
    List<ToDo> findAllByStatus(Boolean isCompleted);
}
