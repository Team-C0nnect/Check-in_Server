package com.project.checkin.domain.condition.exception;

import com.project.checkin.domain.condition.exception.error.ConditionError;
import com.project.checkin.global.exception.BusinessException;

public class ConditionAlreadyDidException extends BusinessException {
    public static final ConditionAlreadyDidException EXCEPTION = new ConditionAlreadyDidException();

    private ConditionAlreadyDidException(){
        super(ConditionError.CONDITION_NOT_SELECTED);
    }
}
