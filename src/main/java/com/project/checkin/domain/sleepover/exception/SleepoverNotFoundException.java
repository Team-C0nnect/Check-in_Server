package com.project.checkin.domain.sleepover.exception;

import com.project.checkin.domain.sleepover.exception.error.SleepoverError;
import com.project.checkin.global.exception.BusinessException;

public class SleepoverNotFoundException extends BusinessException {
    public static final SleepoverNotFoundException EXCEPTION = new SleepoverNotFoundException();

    private SleepoverNotFoundException(){super(SleepoverError.SLEEPOVER_NOT_FOUND);}
}
