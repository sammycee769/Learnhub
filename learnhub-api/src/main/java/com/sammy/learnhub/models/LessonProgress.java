package com.sammy.learnhub.models;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;


@Document(collection = "lesson_progress")
@CompoundIndex(name = "enrolment_lesson_unique", def = "{'enrolmentId': 1, 'lessonId': 1}", unique = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonProgress {

    @Id
    private String id;

    @NotBlank
    private String enrolmentId;

    @NotBlank
    private String lessonId;

    private LocalDateTime completedAt;
}


