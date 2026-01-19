package com.jobfinder.jobservice.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Document(collection = "medias")
public class Media {
    @Id
    private String id;

    private String name;
    private String extension;
    private String mineTypeFile;
    private Boolean isDeleted;
}
