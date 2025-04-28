package com.life_manager.task.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveTaskRequest {
    @NotBlank
    String title;
    @NotBlank
    String description;
    @NotBlank
    String owner;
    @NotBlank
    String status;
    LocalDateTime creationDate;
    LocalDateTime updateDate;
    LocalDateTime endDate;
}
