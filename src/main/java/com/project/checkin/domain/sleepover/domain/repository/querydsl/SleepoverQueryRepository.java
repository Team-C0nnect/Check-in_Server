package com.project.checkin.domain.sleepover.domain.repository.querydsl;

import com.project.checkin.domain.sleepover.dto.Sleepover;
import com.project.checkin.domain.sleepover.dto.request.SleepoverPageRequest;

import java.util.List;

public interface SleepoverQueryRepository {
    List<Sleepover> findStudents(SleepoverPageRequest request);
}