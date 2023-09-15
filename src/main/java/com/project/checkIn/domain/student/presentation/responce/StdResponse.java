package com.project.checkIn.domain.student.presentation.responce;

import com.project.checkIn.domain.student.presentation.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class StdResponse {

    private String stdId;

    public static StdResponse of(Student student){
        return StdResponse.builder()
                .stdId(student.getStdId())
                .build();
    }
}
