package com.project.checkin.domain.sleepover.domain.repository.querydsl;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SleepoverQueryRepository {
    Page<SleepoverEntity> findAcceptedStudents(Pageable pageable, SleepoverStatus sleepoverStatus);
}