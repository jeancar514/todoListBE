package com.todoList.appTodoList.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Date date;
    private Boolean completed;

    public Task() {
    }

    public Task(Long id, String description, Date date, Boolean completed) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.completed = completed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String descrition) {
        this.description = descrition;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Boolean getCompleted() {
        return completed;
    }
}
