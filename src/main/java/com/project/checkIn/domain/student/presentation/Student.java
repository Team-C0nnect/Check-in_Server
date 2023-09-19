package com.project.checkIn.domain.student.presentation;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Student {
    private String stdId;

    @Builder
    public Student(String stdId) {
        this.stdId = stdId;
    }
}
