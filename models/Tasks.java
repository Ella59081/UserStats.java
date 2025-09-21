package models;

import enums.Status;

public class Tasks {
    int taskId;
    String taskName;
    Status status;
    String description;

    public Tasks(int taskId, String taskName, Status status, String description) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.description = description;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
