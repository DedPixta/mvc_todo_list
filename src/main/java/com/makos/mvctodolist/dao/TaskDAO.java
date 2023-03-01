package com.makos.mvctodolist.dao;

import com.makos.mvctodolist.domain.Task;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskDAO extends PagingAndSortingRepository<Task, Integer> {

    List<Task> findAll();
}
