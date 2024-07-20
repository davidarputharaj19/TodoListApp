package com.davidarputharaj.todolistapp.service;

import com.davidarputharaj.todolistapp.domain.TodoRequest;
import com.davidarputharaj.todolistapp.entity.Todo;
import com.davidarputharaj.todolistapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo saveTodo(TodoRequest todoRequest){
        Todo todo = new Todo();
        if(todoRequest != null){
            if(todoRequest.getTitle() != null){
                todo.setTitle(todoRequest.getTitle());
            }
        }
        return todoRepository.save(todo);
    }

    public Todo getTodoById(UUID id) {
        return todoRepository.findById(id).get();
    }

    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    public void deleteTodo(UUID id) {
        todoRepository.deleteById(id);
    }
}
