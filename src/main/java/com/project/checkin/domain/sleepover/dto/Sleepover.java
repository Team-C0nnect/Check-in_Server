package com.project.checkin.domain.sleepover.dto;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sleepover {

    private Long id;

    private String userId;

    private LocalDate startDate;

    private LocalDate endDate;

    private String reason;

    private SleepoverStatus approval;

    private LocalDate createdDate;

    private LocalDate modifiedDate;
}
