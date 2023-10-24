package com.project.checkin.domain.sleepover.mapper;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.dto.Sleepover;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class SleepoverMapper {
    public Sleepover toSleepover(SleepoverEntity entity){
        return Sleepover.builder()
                .id(entity.getId())
                .reason(entity.getReason())
                .approval(entity.getApproval())
                .createdDate(LocalDate.from(entity.getCreatedDateTime()))
                .modifiedDate(LocalDate.from(entity.getModifiedDateTime()))
                .build();
    }

    public SleepoverEntity toCreate(Long id, String userId, LocalDate startDate, LocalDate endDate, String reason){
        return SleepoverEntity.builder()
                .id(id)
                .userId(userId)
                .startDate(startDate)
                .endDate(endDate)
                .approval(SleepoverStatus.SLEEPOVER_WAITING)
                .createdDateTime(LocalDateTime.now())
                .modifiedDateTime(LocalDateTime.now())
                .build();
    }
}
