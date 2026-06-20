package com.sammy.learnhub.models;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "modules")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Module {

    @Id
    private String id;

    @Indexed
    @NotBlank
    private String courseId;

    @NotBlank
    private String title;

    private int order;

    @Builder.Default
    private boolean isLocked = true;
}
