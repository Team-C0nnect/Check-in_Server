package com.project.checkin.domain.condition.service.querydsl;

import com.project.checkin.domain.condition.dto.Condition;
import com.project.checkin.domain.condition.dto.request.ConditionPageRequest;

import java.util.List;

public interface ConditionQueryService {
    List<Condition> findByFeels(ConditionPageRequest pageRequest);

}
