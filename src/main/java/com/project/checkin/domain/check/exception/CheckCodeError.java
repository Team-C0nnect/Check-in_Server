package com.project.checkin.domain.check.exception;

import com.project.checkin.domain.check.exception.error.CheckError;
import com.project.checkin.global.exception.BusinessException;

public class CheckCodeError extends BusinessException {

    public static final CheckCodeError EXCEPTION = new CheckCodeError();

    private CheckCodeError() {
        super(CheckError.CHECK_ERROR);
    }
}
