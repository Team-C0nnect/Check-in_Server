package com.project.checkin.domain.user.exception;

import com.project.checkin.domain.user.exception.error.UserError;
import com.project.checkin.global.exception.BusinessException;

public class UserAlreadyExistsException extends BusinessException {

    public static final UserAlreadyExistsException EXCEPTION = new UserAlreadyExistsException();

    private UserAlreadyExistsException() {
        super(UserError.USER_CONFLICT);
    }
}

