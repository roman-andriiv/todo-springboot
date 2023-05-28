package com.andriiv.todoappbackend.todo.controllers;

import com.andriiv.todoappbackend.todo.entities.Todo;
import com.andriiv.todoappbackend.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Roman Andriiv (23.05.2023 - 19:17)
 */
@RestController
public class TodoController {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/users/{username}/todos")
    public List<Todo> getTodos(@PathVariable String username) {
        return todoRepository.findByUsername(username);
    }

    @GetMapping("/users/{username}/todos/{id}")
    public Todo getTodoById(@PathVariable String username, @PathVariable Integer id) {
        return todoRepository.findById(id).get();
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodoById(@PathVariable String username, @PathVariable Integer id) {
        todoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/users/{username}/todos")
    public Todo createTodo(@PathVariable String username, @RequestBody Todo todo) {
        todo.setUsername(username);
        todo.setId(null);
        return todoRepository.save(todo);
    }

    @PutMapping("/users/{username}/todos/{id}")
    public Todo updateTodoById(@PathVariable Integer id, @RequestBody Todo todo) {
        return todoRepository.save(todo);

    }
}
