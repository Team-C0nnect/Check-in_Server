package com.project.checkin.domain.condition.domain.repository.querydsl;

import com.project.checkin.domain.condition.domain.enums.Feels;
import com.project.checkin.domain.condition.dto.Condition;
import com.project.checkin.domain.condition.dto.request.ConditionPageRequest;
import com.project.checkin.global.common.dto.request.PageRequest;

import java.util.List;

public interface ConditionQueryRepository {
    List<Condition> findByFeels(ConditionPageRequest request);

}
