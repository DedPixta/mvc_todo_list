package com.makos.mvctodolist.service;

import com.makos.mvctodolist.dao.TaskDAO;
import com.makos.mvctodolist.domain.Task;
import com.makos.mvctodolist.dto.TaskDTO;
import com.makos.mvctodolist.error.TaskNotFoundException;
import com.makos.mvctodolist.mapper.TaskMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor

@Service
@Transactional(readOnly = true)
public class TaskServiceImpl implements TaskService {

    private final TaskDAO taskDAO;

    @Override
    public TaskDTO findById(Integer id) {
        return taskDAO.findById(id)
                .map(TaskMapper.INSTANCE::mapToTaskDTO)
                .orElseThrow(TaskNotFoundException::new);
    }

    @Override
    public Page<TaskDTO> findAll(PageRequest pageRequest) {
        return taskDAO.findAll(pageRequest)
                .map(TaskMapper.INSTANCE::mapToTaskDTO);
    }

    @Transactional
    @Override
    public void save(TaskDTO taskDTO) {
        Task task = TaskMapper.INSTANCE.mapToTask(taskDTO);
        taskDAO.save(task);
    }

    @Transactional
    @Override
    public void update(TaskDTO taskDTO) {
        Task task = TaskMapper.INSTANCE.mapToTask(taskDTO);
        taskDAO.save(task);
    }

    @Transactional
    @Override
    public void delete(TaskDTO taskDTO) {
        Task task = TaskMapper.INSTANCE.mapToTask(taskDTO);
        taskDAO.delete(task);
    }


}
