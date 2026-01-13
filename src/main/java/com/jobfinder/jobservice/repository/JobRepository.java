package com.jobfinder.jobservice.repository;

import com.jobfinder.jobservice.domain.Job;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface JobRepository extends MongoRepository<Job,String> {

    @Query("{ $or: [ " +
            "{ 'title': { $regex: ?0, $options: 'i' } }, " +
            "{ 'description': { $regex: ?0, $options: 'i' } }, " +
            "{ 'skills': { $regex: ?0, $options: 'i' } } ] }")
    List<Job> search(String keyword);

}
