package br.com.rocketseat.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;


public interface TaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findByUserId(UUID userId);
}
