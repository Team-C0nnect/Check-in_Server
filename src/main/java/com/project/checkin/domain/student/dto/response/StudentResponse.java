package com.project.checkin.domain.student.dto.response;

import com.project.checkin.domain.student.dto.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class StudentResponse {

    private String stdId;

    public static StudentResponse of(Student Student){
        return StudentResponse.builder()
                .stdId(Student.getStdId())
                .build();
    }
}
