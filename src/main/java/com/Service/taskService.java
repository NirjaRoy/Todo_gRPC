package com.Service;

import com.Stubs.Task.Task;
import com.Model.TaskDetails;
import org.springframework.data.domain.Page;

import java.util.List;

public interface taskService {
    List<TaskDetails> searchTaskByStatus(Task.searchTaskRequest request);
    List<TaskDetails> searchTaskByName(Task.deleteTaskRequest request);

    TaskDetails createTasks(TaskDetails task);
    List<TaskDetails> searchAllTasks();
    void deleteTask(Task.deleteTaskRequest request);

}
