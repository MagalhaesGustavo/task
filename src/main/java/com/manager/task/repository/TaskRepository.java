package com.manager.task.repository;

import com.manager.task.domain.TaskDomain;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepository  extends MongoRepository<TaskDomain, String> {

    List<TaskDomain> findAll();
}
