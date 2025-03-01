package com.klef.jfsd.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}