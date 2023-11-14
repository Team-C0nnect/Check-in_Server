package com.project.checkin.domain.leave.exception;

import com.project.checkin.domain.leave.exception.error.LeaveError;
import com.project.checkin.global.exception.BusinessException;

public class LeaveAlreadySelectedException extends BusinessException {
    public static final LeaveAlreadySelectedException EXCEPTION = new LeaveAlreadySelectedException();
    private LeaveAlreadySelectedException(){super(LeaveError.LEAVE_CONFLICT);}
}
