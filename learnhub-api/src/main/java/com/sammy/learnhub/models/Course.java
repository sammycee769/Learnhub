package com.sammy.learnhub.models;

import com.sammy.learnhub.models.CourseStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "courses")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    private String id;

    @NotBlank
    private String title;

    private String description;

    @Indexed
    @NotBlank
    private String instructorId;

    @Builder.Default
    private CourseStatus status = CourseStatus.DRAFT;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}