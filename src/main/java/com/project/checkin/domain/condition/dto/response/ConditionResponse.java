package com.project.checkin.domain.condition.dto.response;

import com.project.checkin.domain.condition.domain.ConditionEntity;
import com.project.checkin.domain.condition.domain.enums.Feels;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class ConditionResponse {
    private Long userId;
    private Feels feels;

}
