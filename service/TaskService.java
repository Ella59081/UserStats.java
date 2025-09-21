package service;

import models.Tasks;

public interface TaskService {
    String AddNewTask(Tasks task);
    String UpdateTask(int taskId, Tasks task);
    Tasks getSingleTask(int taskId);
}
