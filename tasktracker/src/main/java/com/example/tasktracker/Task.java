package com.example.tasktracker;

public class Task {
    private Long id;
    private String title;
    private boolean completed;

    public Task(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
}
