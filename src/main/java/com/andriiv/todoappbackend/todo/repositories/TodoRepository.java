package com.andriiv.todoappbackend.todo.repositories;

import com.andriiv.todoappbackend.todo.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Roman Andriiv (27.05.2023 - 21:58)
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    List<Todo> findByUsername(String username);

    Todo findByUsernameAndId(String username, Integer id);

}
