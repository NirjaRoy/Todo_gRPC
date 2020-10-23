package com.Service;

import com.Stubs.Task.Task;
import com.Model.TaskDetails;
import com.Data.TaskDetailsRepository;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class taskServiceImpl implements taskService {

    TaskDetailsRepository taskDetailsRepository;

    @Override
    public TaskDetails createTasks(TaskDetails request) {
        TaskDetails taskDetails = taskDetailsRepository.save(request);
        return taskDetails;
    }

    @Override
    public List<TaskDetails> searchTaskByStatus(Task.searchTaskRequest request) {
        List<TaskDetails> TaskDetailsList = taskDetailsRepository.searchTasksByStatus(request);
        if (Objects.nonNull(TaskDetailsList) && !TaskDetailsList.isEmpty()) {
            return TaskDetailsList;
        }
        return Arrays.asList(TaskDetails.builder().taskName("No task with this status").build());
    }

    @Override
    public List<TaskDetails> searchTaskByName(Task.deleteTaskRequest request) {
        List<TaskDetails> TaskDetailsList = taskDetailsRepository.searchTasksByName(request);
        if (Objects.nonNull(TaskDetailsList) && !TaskDetailsList.isEmpty()) {
            return TaskDetailsList;
        }
        return Arrays.asList(TaskDetails.builder().taskName("No task with this status").build());
    }

    @Override
    public List<TaskDetails> searchAllTasks() {
        List<TaskDetails> TaskDetailsList = taskDetailsRepository.findAll();
        if (Objects.nonNull(TaskDetailsList) && !TaskDetailsList.isEmpty()) {
            return TaskDetailsList;
        }
        return TaskDetailsList;
    }

    @Override
    public void deleteTask(Task.deleteTaskRequest request) {
        TaskDetails response = TaskDetails.builder().taskName(request.getTaskName()).build();
        taskDetailsRepository.delete(response);
    }


}





