package com.project.checkin.domain.condition.exception;

import com.project.checkin.domain.condition.exception.error.ConditionError;
import com.project.checkin.global.exception.BusinessException;

public class ConditionNotSelectedException extends BusinessException {
    public static final ConditionNotSelectedException EXCEPTION = new ConditionNotSelectedException();

    private ConditionNotSelectedException(){super(ConditionError.CONDITION_NOT_SELECTED);
    }
}
