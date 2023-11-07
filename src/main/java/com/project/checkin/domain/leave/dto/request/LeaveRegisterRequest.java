package com.project.checkin.domain.leave.dto.request;

import com.project.checkin.domain.leave.dto.Leave;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class LeaveRegisterRequest {

    private Long id;

    @NotNull
    private Long userId;

    @NotNull
    private LocalDate leaveDate;

    public Leave toLeave() {
        return Leave.builder()
                .id(this.id)
                .userId(this.userId)
                .leaveDate(this.leaveDate)
                .build();
    }

}
