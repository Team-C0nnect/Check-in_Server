package com.project.checkin.domain.check.exception;

import com.project.checkin.domain.check.exception.error.CheckError;
import com.project.checkin.global.exception.BusinessException;

public class CheckAlreadyExistsException extends BusinessException {

    public static final CheckAlreadyExistsException EXCEPTION = new CheckAlreadyExistsException();

    private CheckAlreadyExistsException() {
        super(CheckError.CHECK_CONFLICT);
    }
}
