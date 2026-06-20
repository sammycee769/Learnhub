package com.sammy.learnhub.models;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "enrolments")
@CompoundIndex(name = "learner_course_unique", def = "{'learnerId': 1, 'courseId': 1}", unique = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Enrolment {

    @Id
    private String id;

    @NotBlank
    private String learnerId;

    @NotBlank
    private String courseId;

    @Builder.Default
    private EnrolmentStatus status = EnrolmentStatus.IN_PROGRESS;

    @Builder.Default
    private CertificateStatus certificateStatus = CertificateStatus.NOT_ISSUED;

    private LocalDateTime enrolledAt;

    private LocalDateTime completedAt;
}