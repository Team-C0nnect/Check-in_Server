package com.project.checkin.domain.sleepover.domain.repository.querydsl;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.dto.response.SleepoverResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SleepoverQueryRepository {
    Page<SleepoverResponse> findAcceptedStudents(Pageable pageable, SleepoverStatus sleepoverStatus);
}