package com.project.checkin.domain.sleepover.mapper;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.dto.Sleepover;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SleepoverMapper {
    public Sleepover toSleepover(SleepoverEntity entity){
        return Sleepover.builder()
                .id(entity.getId())
                .reason(entity.getReason())
                .approval(entity.getApproval())
                .createdDate(LocalDateTime.from(entity.getCreatedDateTime()))
                .modifiedDate(LocalDateTime.from(entity.getModifiedDateTime()))
                .build();
    }

    public SleepoverEntity toCreate(Sleepover sleepover){
        return SleepoverEntity.builder()
                .userId(sleepover.getUserId())
                .startDateTime(sleepover.getStartDateTime())
                .endDateTime(sleepover.getEndDateTime())
                .approval(SleepoverStatus.SLEEPOVER_WAITING)
                .createdDateTime(LocalDateTime.now())
                .modifiedDateTime(LocalDateTime.now())
                .build();
    }


}
