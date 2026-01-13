package com.jobfinder.jobservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record JobRequest(
        @NotBlank
        String title,
        @NotBlank
        String description,
        @NotBlank
        String company,
        @NotBlank
        Integer exp,
        @NotEmpty
        List<String> skills,

        String location

) {
}
