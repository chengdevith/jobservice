package com.jobfinder.jobservice.controller;

import com.jobfinder.jobservice.domain.Job;
import com.jobfinder.jobservice.dto.JobRequest;
import com.jobfinder.jobservice.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/jobs")
public class JobController {

    private final JobService jobService;

    @GetMapping()
    public List<Job> getAllJobs() {
        return jobService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        jobService.delete(id);
    }

    @GetMapping("/search")
    public List<Job> search(@RequestParam String keyword){
        return jobService.search(keyword);
    }

    @PostMapping()
    public Job createJob(@RequestBody JobRequest job) {
        return jobService.create(job);
    }
}
