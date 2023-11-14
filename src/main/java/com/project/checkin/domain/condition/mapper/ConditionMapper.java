package com.project.checkin.domain.condition.mapper;

import com.project.checkin.domain.condition.domain.ConditionEntity;
import com.project.checkin.domain.condition.dto.Condition;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class ConditionMapper {

    public Condition toCondition(ConditionEntity entity){
        return Condition.builder()
                .id(entity.getId())
                .userId(entity.getUserId())
                .todayFeels(entity.getTodayFeels())
                .endDateTime(entity.getEndDateTime())
                .build();
    }

    public ConditionEntity toCreate(Condition condition){
        return ConditionEntity.builder()
                .userId(condition.getUserId())
                .todayFeels(condition.getTodayFeels())
                .endDateTime(LocalDateTime.now())
                .build();
    }
}
