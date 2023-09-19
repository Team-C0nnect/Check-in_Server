package com.project.checkin.domain.student.dto.request;

import com.project.checkin.domain.student.domain.StudentEntity;
import com.project.checkin.domain.student.dto.Student;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class StudentRequest {

    @Schema(description = "학생 학번")
    @NotBlank
    @Length(max = 4, min = 4)
    private String stdId;

    public Student toStudent() {
        return Student.builder()
                .stdId(stdId)
                .build();
    }
}
