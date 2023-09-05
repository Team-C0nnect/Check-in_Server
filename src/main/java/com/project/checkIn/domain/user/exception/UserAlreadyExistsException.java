package com.project.checkIn.domain.user.exception;

import com.project.checkIn.domain.user.exception.error.UserError;
import com.project.checkIn.global.exception.BusinessException;

public class UserAlreadyExistsException extends BusinessException {

    public static final UserAlreadyExistsException EXCEPTION = new UserAlreadyExistsException();

    private UserAlreadyExistsException() {
        super(UserError.USER_CONFLICT);
    }
}

