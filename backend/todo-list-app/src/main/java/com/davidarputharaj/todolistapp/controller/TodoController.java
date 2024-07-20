package com.davidarputharaj.todolistapp.controller;

import com.davidarputharaj.todolistapp.domain.TodoRequest;
import com.davidarputharaj.todolistapp.entity.Todo;
import com.davidarputharaj.todolistapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/todo")
    public Todo saveTodo(@RequestBody TodoRequest todoRequest){
        return todoService.saveTodo(todoRequest);
    }

    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return todoService.getTodos();
    }

    @GetMapping("/todo/{id}")
    public Todo getTodo(@PathVariable("id") UUID id){
        return todoService.getTodoById(id);
    }

    @DeleteMapping("/todo/{id}")
    public void deleteTodo(@PathVariable("id") UUID id){
        todoService.deleteTodo(id);
    }
}
