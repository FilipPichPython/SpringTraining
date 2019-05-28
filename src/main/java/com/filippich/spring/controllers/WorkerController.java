package com.filippich.spring.controllers;

import com.filippich.spring.model.Worker;
import com.filippich.spring.service.WorkerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")  //prefix
public class WorkerController {

    private WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping("/workers")
    public List<Worker> getAllWorkers(){
        return workerService.getWorkers();
    }
}
