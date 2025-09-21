package service.impl;

import enums.Status;
import models.Tasks;
import service.TaskService;

public class TaskImpl implements TaskService {

    @Override
    public String AddNewTask(Tasks task) {
        task.setTaskId(101);
        task.setTaskName("Eat in the morning");
        task.setStatus(Status.IN_PROGRESS);
        task.setDescription("Task to eat breakfast int the morning");

        return "Your task " + task.getTaskName() + " has been added";
    }

    @Override
    public String UpdateTask(int taskId, Tasks task) {
        return "";
    }

    @Override
    public Tasks getSingleTask(int taskId) {
        return null;
    }
}
