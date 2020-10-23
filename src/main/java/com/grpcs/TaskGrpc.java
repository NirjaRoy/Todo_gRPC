package com.grpcs;

import com.Stubs.Task.Task;
import com.Stubs.Task.Task.createTaskRequest;
import com.Stubs.Task.Task.createTaskResponse;
import com.Stubs.Task.Task.searchTaskRequest;
import com.Stubs.Task.Task.searchTaskResponse;
import com.Stubs.Task.Task.taskDetails;
import com.Stubs.Task.Task.Empty;
import com.Stubs.Task.taskGrpc;
import com.Model.TaskDetails;
import com.Service.taskService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@RequiredArgsConstructor
public class TaskGrpc extends taskGrpc.taskImplBase {
    private taskService ts;
    private TaskDetails taskDetails;

    @Override
    public void createTask(createTaskRequest request, StreamObserver<createTaskResponse> responseObserver) {
        taskDetails task = request.getTask();
        TaskDetails taskData = TaskDetails.fromProto(task);
        TaskDetails saved = ts.createTasks(taskData);

        createTaskResponse.Builder response = createTaskResponse.newBuilder();
        response.setResponseMessage("Task Created");
        response.setTaskName(saved.getTaskName());
        response.setInfo("Status :" + saved.getStatus());
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void findTasksByStatus(searchTaskRequest request, StreamObserver<searchTaskResponse> responseObserver) {
        List<TaskDetails> taskDetailsList = ts.searchTaskByStatus(request);
        List<Task.taskDetails> taskDetails = taskDetailsList.stream().map(TaskDetails::toProto).collect(Collectors.toList());
        searchTaskResponse response = searchTaskResponse.newBuilder().addAllTask(taskDetails).build(); //addAllResultList(taskDetails).build(); //setTaskName(taskDetails.listIterator()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void findAllTask(Empty request, StreamObserver<Task.taskDetails> responseObserver) {
        List<TaskDetails> taskDetailsList = ts.searchAllTasks();
        for (TaskDetails task : taskDetailsList) {
            responseObserver.onNext(task.toProto());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void deleteTask(Task.deleteTaskRequest request, StreamObserver<createTaskResponse> responseObserver) {
        ts.deleteTask(request);
        createTaskResponse.Builder response = createTaskResponse.newBuilder();
        if (ts.searchTaskByName(request) == null) {
            response.setResponseMessage("Task Deleted");
            response.setTaskName(request.getTaskName());
        } else {
            response.setResponseMessage("Task deletion Unsuccessful");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
