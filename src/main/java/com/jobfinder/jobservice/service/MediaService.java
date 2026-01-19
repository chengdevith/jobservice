package com.jobfinder.jobservice.service;

import com.jobfinder.jobservice.dto.MediaResponse;
import org.springframework.web.multipart.MultipartFile;

public interface MediaService {

    MediaResponse upload(MultipartFile file);

    void deleteFile(String fileName);
}
