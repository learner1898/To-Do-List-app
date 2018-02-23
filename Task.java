package com.example.yash.to_do;


public class Task {
    String task;
    int id;
   public Task(String arg){
       this.task = arg;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public int getId() {
        return id;
    }
}
