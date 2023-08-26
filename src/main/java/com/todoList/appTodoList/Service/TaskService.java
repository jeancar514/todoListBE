package com.todoList.appTodoList.Service;

import com.todoList.appTodoList.Entity.Task;
import com.todoList.appTodoList.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TaskService {
    @Autowired
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        return (List<Task>) taskRepository.findAll();
    }
    public void markTaskAsCompleted(Long id, Boolean completed) {
        Task task = taskRepository.findById(id).orElse(null);


        if (task != null) {
            // Modificar la propiedad completada
            task.setCompleted(completed);
            // Guardar los cambios
            taskRepository.save(task);
        }
    }

    public void createTaks(Task newTask) {
        taskRepository.save(newTask);
    }

    public void deleteTaks(Long id) {

        taskRepository.deleteById(id);
    }


}
