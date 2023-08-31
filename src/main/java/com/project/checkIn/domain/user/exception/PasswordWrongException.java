package com.project.checkIn.domain.user.exception;


import com.project.checkIn.domain.user.exception.error.UserError;
import com.project.checkIn.global.exception.BusinessException;

public class PasswordWrongException extends BusinessException {

    public static final PasswordWrongException EXCEPTION = new PasswordWrongException();

    private PasswordWrongException() {
        super(UserError.PASSWORD_WRONG);
    }

}
