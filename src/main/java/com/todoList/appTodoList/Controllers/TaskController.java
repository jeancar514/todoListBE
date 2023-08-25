package com.todoList.appTodoList.Controllers;

import com.todoList.appTodoList.Entity.Task;
import com.todoList.appTodoList.Service.TaskService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/task")
public class TaskController {
    static Logger log = LogManager.getLogger(TaskController.class);

    @Autowired
    private TaskService taskService;

    @GetMapping("")
    public List<Task> getAllTask(){
        List<Task> response =  new ArrayList<>();
        try{
            response = taskService.findAll();

        }catch (Exception e){
            log.error(String.format("Error en metodo getAllTask: %s", e.getMessage()));
        }
        return response;
    }

    @PostMapping("create")
    public void createTask(@RequestBody Task task){
        try{
            taskService.createTaks(task);

        }catch (Exception e){
            log.error(String.format("Error en metodo createTaks: %s", e.getMessage()));
        }
    }

    @DeleteMapping("delete/{id}")
    public void deleteTask(@PathVariable Long id){
        try{
            taskService.deleteTaks(id);
        }catch (Exception e){
            log.error(String.format("Error en metodo createTaks: %s", e.getMessage()));
        }
    }

    @PostMapping("update")
    public void updateTask( @RequestBody Map<String,Object> requestBody){
        try{
            taskService.markTaskAsCompleted((Long) requestBody.get("id"), (Boolean) requestBody.get("completed"));
        }catch (Exception e){
            log.error(String.format("Error en metodo createTaks: %s", e.getMessage()));
        }
    }





}
