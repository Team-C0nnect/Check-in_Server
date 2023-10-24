package com.project.checkin.domain.condition.dto.request;

import com.project.checkin.domain.condition.domain.enums.Feels;
import com.project.checkin.domain.condition.dto.Condition;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConditionRequest {
    @Schema(description = "컨디션 상태")
    private Long userId;
    private Feels feels;

    Condition toCondition(){
        return Condition.builder()
                .userId(this.userId)
                .todayFeels(this.feels)
                .build();
    }

}
