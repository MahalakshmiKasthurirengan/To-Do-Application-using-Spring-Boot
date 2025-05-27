package com.todo.To.Do.Application.Repository;

import com.todo.To.Do.Application.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
