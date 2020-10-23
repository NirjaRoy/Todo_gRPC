package com.Data;

import com.Model.TaskDetails;
import com.Stubs.Task.Task;
import com.Stubs.Task.Task.searchTaskRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskDetailsRepository extends JpaRepository<TaskDetails, Long> {
    @Query("select t.taskName from TaskDetails t where t.status = ?1")
    List<TaskDetails> searchTasksByStatus(searchTaskRequest request);

    @Query("select t.taskName from TaskDetails t where t.taskName =?1")
    List<TaskDetails> searchTasksByName(Task.deleteTaskRequest request);
}
