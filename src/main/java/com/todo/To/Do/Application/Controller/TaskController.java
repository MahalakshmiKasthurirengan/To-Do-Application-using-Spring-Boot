package com.todo.To.Do.Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.todo.To.Do.Application.Model.Task;
import com.todo.To.Do.Application.Service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
