package com.project.checkin.domain.condition.mapper;

import com.project.checkin.domain.condition.domain.ConditionEntity;
import com.project.checkin.domain.condition.domain.enums.Feels;
import com.project.checkin.domain.condition.dto.Condition;
import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ConditionMapper {

    public Condition toCondition(ConditionEntity entity){
        return Condition.builder()
                .id(entity.getId())
                .userId(entity.getUserId())
                .todayFeels(entity.getTodayFeels())
                .endDate(entity.getEndDate())
                .build();
    }

    public ConditionEntity toCreate(Long id, String userId, Feels feels){
        return ConditionEntity.builder()
                .id(id)
                .userId(userId)
                .todayFeels(feels)
                .endDate(LocalDate.now())
                .build();
    }
}
