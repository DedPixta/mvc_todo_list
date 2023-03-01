package com.makos.mvctodolist.service;

import com.makos.mvctodolist.domain.Task;

import java.util.List;

public interface TaskService {
    List<Task> findAll();
}
