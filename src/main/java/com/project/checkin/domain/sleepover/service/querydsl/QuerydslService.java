package com.project.checkin.domain.sleepover.service.querydsl;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuerydslService {
    Page<SleepoverEntity> findSleepoverStudents(Pageable pageable, SleepoverStatus sleepoverStatus);
}
