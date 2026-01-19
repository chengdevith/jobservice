package com.jobfinder.jobservice.controller;

import com.jobfinder.jobservice.dto.MediaResponse;
import com.jobfinder.jobservice.service.MediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/medias")
public class MediaController {

    private final MediaService mediaService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/upload")
    public MediaResponse upload(@RequestPart MultipartFile file) {
        return mediaService.upload(file);
    }

    @DeleteMapping("{fileName}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String fileName) {
        mediaService.deleteFile(fileName);
    }
}
