package com.project.checkin.domain.sleepover.service.querydsl;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.domain.repository.querydsl.SleepoverQueryRepositoryImpl;
import com.project.checkin.domain.sleepover.dto.response.SleepoverResponse;
import com.project.checkin.global.common.dto.request.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SleepoverQueryServiceImpl implements SleepoverQueryService {
    SleepoverQueryRepositoryImpl queryRepository;

    @Transactional(readOnly = true)
    @Override
    public List<SleepoverResponse> findSleepoverStudents(PageRequest request, SleepoverStatus sleepoverStatus) {
        return queryRepository.findAcceptedStudents(request, sleepoverStatus);
    }
}