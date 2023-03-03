package com.makos.mvctodolist.service;

import com.makos.mvctodolist.dao.TaskDAO;
import com.makos.mvctodolist.domain.Task;
import com.makos.mvctodolist.error.TaskNotFoundException;
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
    public Task findById(Integer id) {
        return taskDAO.findById(id)
                .orElseThrow(TaskNotFoundException::new);
    }

    @Override
    public Page<Task> findAll(PageRequest pageRequest) {
        return taskDAO.findAll(pageRequest);
    }

    @Transactional
    @Override
    public void save(Task task) {
        taskDAO.save(task);
    }

    @Transactional
    @Override
    public void update(Task task) {
        taskDAO.save(task);
    }

    @Transactional
    @Override
    public void delete(Task task) {
        taskDAO.delete(task);
    }


}
