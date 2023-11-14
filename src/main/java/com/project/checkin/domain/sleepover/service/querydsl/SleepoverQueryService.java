package com.project.checkin.domain.sleepover.service.querydsl;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.dto.response.SleepoverResponse;
import com.project.checkin.global.common.dto.request.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SleepoverQueryService {
    List<SleepoverResponse> findSleepoverStudents(PageRequest request, SleepoverStatus sleepoverStatus);
}
