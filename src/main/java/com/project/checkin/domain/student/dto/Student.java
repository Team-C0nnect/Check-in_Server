package com.project.checkin.domain.student.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    private Long id;
    private String stdId;
}
