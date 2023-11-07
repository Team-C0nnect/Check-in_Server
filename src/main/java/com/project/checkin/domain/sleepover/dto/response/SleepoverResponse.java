package com.project.checkin.domain.sleepover.dto.response;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class SleepoverResponse {
    private Long userId;
    private SleepoverStatus approval;

    public static SleepoverResponse of(SleepoverEntity sleepover){
        return SleepoverResponse.builder()
                .userId(sleepover.getUserId())
                .approval(sleepover.getApproval())
                .build();
    }
}
