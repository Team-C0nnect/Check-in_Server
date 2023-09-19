package com.project.checkIn.domain.student.presentation.request;

import com.project.checkIn.domain.student.presentation.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StdRequest {

    private String stdId;

    public Student toEntity() {
        return Student.builder()
                .stdId(this.stdId)
                .build();
    }
}
