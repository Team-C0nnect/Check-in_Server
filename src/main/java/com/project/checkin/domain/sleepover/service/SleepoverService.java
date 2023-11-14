package com.project.checkin.domain.sleepover.service;

import com.project.checkin.domain.sleepover.dto.Sleepover;
import com.project.checkin.domain.sleepover.dto.request.SleepoverRequest;

public interface SleepoverService {
    Sleepover find();
    void registerSleepover(Sleepover sleepover);
    void refuseSleepover(Long sleepoverId);

    void acceptSleepover(Long sleepoverId);
}
