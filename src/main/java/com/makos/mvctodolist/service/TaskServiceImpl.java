package com.makos.mvctodolist.service;

import com.makos.mvctodolist.dao.TaskDAO;
import com.makos.mvctodolist.domain.Task;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskDAO taskDAO;

    @Override
    public List<Task> findAll() {
        return taskDAO.findAll();
    }
}
