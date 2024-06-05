package com.atv.atves.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class TaskController {

 @GetMapping("/html")
    public String tasksPage(Model model) {
        // Adicione lógica para obter as tarefas do banco de dados ou de outra fonte de dados
        // Por simplicidade, vamos criar algumas tarefas fictícias
        List<String> tasks = new ArrayList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        
        model.addAttribute("tasks", tasks);
        
        return "tasks"; // Retorna a view tasks.html
    }

    @GetMapping("/json")
    public List<String> getTasksJson() {
        // Adicione lógica para obter as tarefas do banco de dados ou de outra fonte de dados
        // Por simplicidade, vamos criar algumas tarefas fictícias
        List<String> tasks = new ArrayList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        
        return tasks;
    }
}
