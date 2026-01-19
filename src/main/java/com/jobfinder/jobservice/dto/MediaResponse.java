package com.jobfinder.jobservice.dto;

import lombok.Builder;

@Builder
public record MediaResponse(
        String name,
        String extension,
        String mimeTypeFile,
        String uri,
        Long size
) {
}
