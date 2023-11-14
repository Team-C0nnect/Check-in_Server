package com.project.checkin.domain.sleepover.domain.repository.querydsl;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.dto.response.SleepoverResponse;
import com.project.checkin.global.common.dto.request.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SleepoverQueryRepository {
    List<SleepoverResponse> findAcceptedStudents(PageRequest request, SleepoverStatus sleepoverStatus);
}