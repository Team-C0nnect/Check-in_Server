package com.project.checkin.domain.leave.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Leave {

    private Long id;

    private Long userId;

    private LocalDate leaveDate;

}
