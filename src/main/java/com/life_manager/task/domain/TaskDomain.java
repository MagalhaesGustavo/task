package com.life_manager.task.domain;

import com.life_manager.task.dto.SaveTaskRequest;
import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.mapstruct.Mapper;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@Document("task")
public class TaskDomain {

    @Id()
    String id;
    String title;
    String description;
    String owner;
    String status;
    LocalDateTime creationDate;
    LocalDateTime updateDate;
    LocalDateTime endDate;
}
