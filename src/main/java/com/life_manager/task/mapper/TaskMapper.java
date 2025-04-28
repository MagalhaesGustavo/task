package com.life_manager.task.mapper;

import com.life_manager.task.domain.TaskDomain;
import com.life_manager.task.dto.SaveTaskRequest;
import com.life_manager.task.dto.SaveTaskResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper()
public interface TaskMapper {

    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

//    @Mapping(source = "", target = "")
    SaveTaskResponse toSaveTaskResponse(TaskDomain TaskDomain);


    SaveTaskResponse toDTO(TaskDomain taskDomain);
    TaskDomain toDomain(SaveTaskRequest saveTaskRequest);
//        return SaveTaskResponse.builder()
//                .id(TaskDomain.getId())
//                .title(TaskDomain.getTitle())
//                .owner(TaskDomain.getOwner())
//                .status(TaskDomain.getStatus())
//                .creationDate(TaskDomain.getCreationDate())
//                .updateDate(TaskDomain.getUpdateDate())
//                .endDate(TaskDomain.getEndDate())
//                .description(TaskDomain.getDescription())
//                .build();
//    }
}
