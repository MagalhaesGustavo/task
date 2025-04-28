package com.life_manager.task.controller;

import com.life_manager.task.domain.TaskDomain;
import com.life_manager.task.dto.SaveTaskRequest;
import com.life_manager.task.service.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    final TaskService taskService;

    @PostMapping
    ResponseEntity<TaskDomain> saveTask(@Valid  @RequestBody SaveTaskRequest saveTaskRequest){
        return ResponseEntity.ok().body(taskService.saveTask(saveTaskRequest));
    }

    @GetMapping
    ResponseEntity<List<TaskDomain>> getAllTasks(){
        return ResponseEntity.ok().body(taskService.getAll());
    }
}
