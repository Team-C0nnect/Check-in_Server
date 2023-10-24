package com.project.checkin.domain.condition.dto;

import com.project.checkin.domain.condition.domain.enums.Feels;
import lombok.*;

import java.time.LocalDate;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Condition {
    private Long id;
    private String userId;
    private Feels todayFeels;
    private LocalDate endDate;
}
