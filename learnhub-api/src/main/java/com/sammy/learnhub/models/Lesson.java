package com.sammy.learnhub.models;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lessons")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {

    @Id
    private String id;

    @Indexed
    @NotBlank
    private String moduleId;

    @NotBlank
    private String title;

    private String description;

    private String contentUrl;

    private int order;

    private int durationMinutes;
}