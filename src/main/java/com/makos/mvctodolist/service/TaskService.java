package com.makos.mvctodolist.service;

import com.makos.mvctodolist.domain.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface TaskService {

    Task findById(Integer id);

    Page<Task> findAll(PageRequest pageRequest);

    void save(Task task);

    void update(Task task);

    void delete(Task task);

}
