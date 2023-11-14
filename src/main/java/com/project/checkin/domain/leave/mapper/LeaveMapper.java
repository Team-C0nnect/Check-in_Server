package com.project.checkin.domain.leave.mapper;

import com.project.checkin.domain.leave.domain.LeaveEntity;
import com.project.checkin.domain.leave.dto.Leave;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class LeaveMapper {
    public LeaveEntity toCreate(Leave leave){
        return LeaveEntity.builder()
                .id(leave.getId())
                .leaveDate(leave.getLeaveDate())
                .build();
    }
}
