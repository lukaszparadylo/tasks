package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {

    @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public List<TaskDto> getTasks() {
        return new ArrayList<>();
    }
    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public TaskDto getTask(Long taskId) {
        return new TaskDto(1L, "test title", "test_content");
    }
    @RequestMapping(method = RequestMethod.GET, value = "deleteTask")
    public void deleteTask(Long taskId) {

    }
    @RequestMapping(method = RequestMethod.GET, value = "updateTask")
    public TaskDto updateTask(TaskDto taskDto) {
        return new TaskDto(1L, "Edited test title", "Test content");
    }
    @RequestMapping(method = RequestMethod.GET, value = "createTask")
    public void createTask(TaskDto taskDto) {

    }
}
