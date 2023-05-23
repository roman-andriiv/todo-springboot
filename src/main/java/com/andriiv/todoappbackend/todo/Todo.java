package com.andriiv.todoappbackend.todo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Created by Roman Andriiv (23.05.2023 - 18:34)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;
}
