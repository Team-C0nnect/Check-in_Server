package com.project.checkin.domain.condition.service;

import com.project.checkin.domain.condition.dto.Condition;

public interface ConditionService {
    void registerMyFeels(Condition condition);
    Condition find();
}
