package com.life_manager.task.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveTaskResponse {
    String id;
    String title;
    String description;
    String owner;
    String status;
    LocalDateTime creationDate;
    LocalDateTime updateDate;
    LocalDateTime endDate;
}
