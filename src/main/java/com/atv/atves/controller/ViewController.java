package com.atv.atves.controller;

import java.util.ArrayList;
import java.util.List;
import com.atv.atves.model.Task;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ViewController {
    @GetMapping("/tasksPage")
    public String tasksPage(Model model) {
    // Aqui você pode adicionar lógica para obter as tarefas do banco de dados ou de outra fonte de dados
    // Por simplicidade, vamos passar uma lista vazia
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Estudar Spring Boot", false));
        tasks.add(new Task(2, "Desenvolver projeto MVC", true));
        tasks.add(new Task(3, "Preparar apresentação", false));
    
        model.addAttribute("tasks", tasks);
    
        return "tasks"; // Retorna a view tasks.html
    }
}
