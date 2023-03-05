package com.makos.mvctodolist.mapper;

import com.makos.mvctodolist.domain.Task;
import com.makos.mvctodolist.dto.TaskDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaskMapper{
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    TaskDTO mapToTaskDTO(Task task);
    Task mapToTask(TaskDTO taskDTO);
}
