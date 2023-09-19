package com.project.checkIn.domain.student.presentation.request;

import com.project.checkIn.domain.student.domain.StudentEntity;
import com.project.checkIn.domain.student.presentation.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StdRequest {

    private String stdId;

    public StudentEntity toEntity() {
        return StudentEntity.builder()
                .stdId(this.stdId)
                .build();
    }
}
