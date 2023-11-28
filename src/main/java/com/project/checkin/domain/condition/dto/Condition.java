package com.project.checkin.domain.condition.dto;

import com.project.checkin.domain.condition.domain.enums.Feels;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Condition {
    private Long id;
    private Long userId;
    private Feels todayFeels;
    private LocalDateTime endDateTime;
}
