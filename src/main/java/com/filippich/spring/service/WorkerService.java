package com.filippich.spring.service;

import com.filippich.spring.model.Worker;
import com.filippich.spring.repositories.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //wywodzi sie z adnotacji Component
public class WorkerService {

    private WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public List<Worker> getWorkers(){
        return workerRepository.findAll();
    }


}