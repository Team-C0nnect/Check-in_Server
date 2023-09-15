package com.project.checkIn.domain.student.exception;

import com.project.checkIn.domain.student.exception.error.StdError;
import com.project.checkIn.domain.user.exception.UserNotFoundException;
import com.project.checkIn.domain.user.exception.error.UserError;
import com.project.checkIn.global.exception.BusinessException;

public class StdNotFoundException extends BusinessException {
    public static final StdNotFoundException EXCEPTION = new StdNotFoundException();

    private StdNotFoundException() {
        super(StdError.STD_NOT_FOUND);
    }
}
