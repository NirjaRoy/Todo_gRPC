package com.Model;

import com.Stubs.Task.Task.taskDetails;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "task_details")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDetails implements Serializable {

    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
     */
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_name")
    public String taskName;

    @Column(name = "status")
    public String status;


    public taskDetails toProto() {
        return taskDetails.newBuilder()
                .setTaskName(getTaskName())
                .setStatus(getStatus())
                .build();
    }

    public static TaskDetails fromProto(taskDetails taskRequest) {
        TaskDetails task = new TaskDetails();
        task.setTaskName(taskRequest.getTaskName());
        task.setStatus(taskRequest.getStatus());
        return task;
    }

}
