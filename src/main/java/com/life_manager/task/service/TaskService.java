package com.life_manager.task.service;

import com.life_manager.task.domain.TaskDomain;
import com.life_manager.task.dto.SaveTaskRequest;
import com.life_manager.task.mapper.TaskMapper;
import com.life_manager.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public List<TaskDomain> getAll(){
        return taskRepository.findAll();
    }

    public TaskDomain saveTask(SaveTaskRequest saveTaskRequest) {
        return taskRepository.insert(TaskMapper.INSTANCE.toDomain(saveTaskRequest));
    }
}
