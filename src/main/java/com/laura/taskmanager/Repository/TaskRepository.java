package com.laura.taskmanager.Repository;

import com.laura.taskmanager.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}