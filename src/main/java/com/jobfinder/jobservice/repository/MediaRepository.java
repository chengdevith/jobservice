package com.jobfinder.jobservice.repository;

import com.jobfinder.jobservice.domain.Media;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MediaRepository extends MongoRepository<Media,String> {
    Optional<Media> findByNameAndIsDeletedFalse(String name);
}
