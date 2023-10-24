package com.project.checkin.domain.sleepover.dto;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import lombok.*;

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
