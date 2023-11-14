package com.project.checkin.domain.leave.service;

import com.project.checkin.domain.leave.dto.Leave;

public interface LeaveService {
    void registerLeaveWeek(Leave leave);

    void removeLeaveWeek(Long leaveId);
}
