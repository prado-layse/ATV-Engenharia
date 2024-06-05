package com.atv.atves.controller;

import com.atv.atves.model.Task;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public class TaskController {
     @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        // Suponha que você tenha uma classe Task que represente uma tarefa
        List<Task> tasks = new ArrayList<>();
        // Aqui você adicionaria lógica para obter as tarefas do banco de dados ou de outra fonte de dados
        // Por simplicidade, vamos adicionar algumas tarefas fictícias
        tasks.add(new Task(1, "Estudar Spring Boot", false));
        tasks.add(new Task(2, "Desenvolver projeto MVC", true));
        tasks.add(new Task(3, "Preparar apresentação", false));
        return tasks;
    }
}
