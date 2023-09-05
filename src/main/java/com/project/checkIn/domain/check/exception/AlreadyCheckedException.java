package com.project.checkIn.domain.check.exception;

import com.project.checkIn.domain.check.exception.error.CheckError;
import com.project.checkIn.global.exception.BusinessException;

public class AlreadyCheckedException extends BusinessException {

    public static final AlreadyCheckedException EXCEPTION = new AlreadyCheckedException();

    private AlreadyCheckedException(){
        super(CheckError.CHECK_CONFLICT);
    }
}
