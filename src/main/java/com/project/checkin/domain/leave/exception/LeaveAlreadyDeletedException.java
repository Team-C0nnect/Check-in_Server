package com.project.checkin.domain.leave.exception;

import com.project.checkin.domain.leave.exception.error.LeaveError;
import com.project.checkin.global.exception.BusinessException;

public class LeaveAlreadyDeletedException extends BusinessException {
    public static final LeaveAlreadyDeletedException EXCEPTION = new LeaveAlreadyDeletedException();
    private LeaveAlreadyDeletedException(){super(LeaveError.LEAVE_NO_CONTENT);}
}
