package com.project.checkin.domain.vote.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vote {

    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime addDate;

}
