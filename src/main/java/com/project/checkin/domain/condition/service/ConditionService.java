package com.project.checkin.domain.condition.service;

import com.project.checkin.domain.condition.dto.Condition;
import com.project.checkin.domain.condition.dto.request.ConditionRequest;

import java.util.Optional;

public interface ConditionService {
    void registerMyFeels(ConditionRequest request);
    Condition find();
}
