package com.makos.mvctodolist.mapper;

import com.makos.mvctodolist.domain.Task;
import com.makos.mvctodolist.dto.TaskDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper{
    TaskDTO mapToTaskDTO(Task task);
    Task mapToTask(TaskDTO taskDTO);
}
