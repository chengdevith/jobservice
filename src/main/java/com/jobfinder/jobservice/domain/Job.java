package com.jobfinder.jobservice.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Document(collection = "jobs")
public class Job {

    @Id
    private String id;

    private String title;
    private String description;
    private String company;
    private Integer exp;
    private List<String> skills;
    private String location;

    private LocalDateTime createdDate;


}
