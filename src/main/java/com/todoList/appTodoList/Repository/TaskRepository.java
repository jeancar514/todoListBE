package com.todoList.appTodoList.Repository;

import com.todoList.appTodoList.Entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
