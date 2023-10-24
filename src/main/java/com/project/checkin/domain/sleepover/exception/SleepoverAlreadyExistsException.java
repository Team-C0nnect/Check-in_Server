package com.project.checkin.domain.sleepover.exception;

import com.project.checkin.domain.sleepover.exception.error.SleepoverError;
import com.project.checkin.global.exception.BusinessException;

public class SleepoverAlreadyExistsException extends BusinessException {
    public static final SleepoverAlreadyExistsException EXCEPTION = new SleepoverAlreadyExistsException();

    private SleepoverAlreadyExistsException(){super(SleepoverError.SLEEPOVER_CONFLICT);}
}
