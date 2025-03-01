package com.klef.jfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Task;
import com.klef.jfsd.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService 
{
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() 
    {
        return taskRepository.findAll();
    }

    public Task saveTask(Task task) 
    {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) 
    {
        taskRepository.deleteById(id);
    }
}