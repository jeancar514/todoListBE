package com.todoList.appTodoList.dao;

import java.io.Serializable;

public class RequestBodyUpdateComplete implements Serializable {

    private Long id;
    private Boolean completed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean complete) {
        this.completed = complete;
    }
}
