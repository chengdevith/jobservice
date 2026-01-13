package com.jobfinder.jobservice.service;

import com.jobfinder.jobservice.domain.Job;
import com.jobfinder.jobservice.dto.JobRequest;

import java.util.List;

public interface JobService {

    List<Job> findAll();
    List<Job> search(String keyword);
    Job create(JobRequest jobRequest);
    void delete(String id);

}
