package com.project.checkin.domain.sleepover.service;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.sleepover.dto.Sleepover;
import com.project.checkin.domain.sleepover.dto.request.SleepoverRequest;

public interface SleepoverService {
    Sleepover find();
    void registerSleepover(SleepoverEntity sleepover, SleepoverRequest request);
}
