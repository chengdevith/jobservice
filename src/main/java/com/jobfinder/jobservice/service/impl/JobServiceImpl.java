package com.jobfinder.jobservice.service.impl;

import com.jobfinder.jobservice.domain.Job;
import com.jobfinder.jobservice.dto.JobRequest;
import com.jobfinder.jobservice.repository.JobRepository;
import com.jobfinder.jobservice.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;


    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public List<Job> search(String keyword) {
        return jobRepository.search(keyword);
    }

    @Override
    public Job create(JobRequest jobRequest) {
        Job job = Job.builder()
                .title(jobRequest.title())
                .description(jobRequest.description())
                .company(jobRequest.company())
                .exp(jobRequest.exp())
                .skills(jobRequest.skills())
                .location(jobRequest.location())
                .createdDate(LocalDateTime.now())
                .build();
        return jobRepository.save(job);
    }

    @Override
    public void delete(String id) {
        jobRepository.deleteById(id);
    }
}
