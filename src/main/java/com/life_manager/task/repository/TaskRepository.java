package com.life_manager.task.repository;

import com.life_manager.task.domain.TaskDomain;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepository  extends MongoRepository<TaskDomain, String> {

    public List<TaskDomain> findAll();
}
