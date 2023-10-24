package com.project.checkin.domain.sleepover.exception;

import com.project.checkin.domain.sleepover.exception.error.SleepoverError;
import com.project.checkin.global.exception.BusinessException;

public class SleepoverBadRequestException extends BusinessException {
    public static final SleepoverBadRequestException EXCEPTION = new SleepoverBadRequestException();

    private SleepoverBadRequestException(){super(SleepoverError.SLEEPOVER_BAD_REQUEST);}
}
