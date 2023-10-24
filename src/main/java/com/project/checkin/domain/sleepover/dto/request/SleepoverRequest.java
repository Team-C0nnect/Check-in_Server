package com.project.checkin.domain.sleepover.dto.request;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.dto.Sleepover;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SleepoverRequest {

    @Schema(description = "외박자")
    private String userId;
    private String reason;
    private SleepoverStatus approval;

    Sleepover toSleepover() {
        return Sleepover.builder()
                .userId(this.userId)
                .reason(this.reason)
                .approval(this.approval)
                .build();
    }
}
