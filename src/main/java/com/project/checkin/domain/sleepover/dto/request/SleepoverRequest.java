package com.project.checkin.domain.sleepover.dto.request;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.dto.Sleepover;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SleepoverRequest {

    @Schema(description = "외박자")
    @NotNull
    private Long userId;
    @NotBlank
    private String reason;
    @NotNull
    private SleepoverStatus approval;
    @NotNull
    private LocalDateTime startDateTime;
    @NotNull
    private LocalDateTime endDateTime;

    public Sleepover toSleepover() {
        return Sleepover.builder()
                .userId(this.userId)
                .startDateTime(startDateTime)
                .endDateTime(endDateTime)
                .reason(this.reason)
                .approval(this.approval)
                .build();
    }
}
