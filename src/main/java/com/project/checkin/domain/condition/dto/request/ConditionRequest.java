package com.project.checkin.domain.condition.dto.request;

import com.project.checkin.domain.condition.domain.enums.Feels;
import com.project.checkin.domain.condition.dto.Condition;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ConditionRequest {
    @Schema(description = "컨디션 상태")
    private Feels feels;

    public Condition toCondition(){
        return Condition.builder()
//                .userId(this.userId)
                .todayFeels(this.feels)
                .build();
    }

}
