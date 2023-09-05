package com.project.checkIn.domain.check.exception;

import com.project.checkIn.domain.check.exception.error.CheckError;
import com.project.checkIn.global.exception.BusinessException;

public class NotAvailableException extends BusinessException {
    public static final NotAvailableException EXCEPTION = new NotAvailableException();

    private NotAvailableException(){super(CheckError.QR_NOT_AVAILABLE);}
}
