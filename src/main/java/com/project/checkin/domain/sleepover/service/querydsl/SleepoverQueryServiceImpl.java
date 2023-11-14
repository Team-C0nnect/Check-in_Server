package com.project.checkin.domain.sleepover.service.querydsl;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.domain.repository.querydsl.SleepoverQueryRepositoryImpl;
import com.project.checkin.domain.sleepover.dto.response.SleepoverResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SleepoverQueryServiceImpl implements SleepoverQueryService {
    SleepoverQueryRepositoryImpl queryRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Page<SleepoverResponse> findSleepoverStudents(Pageable pageable, SleepoverStatus sleepoverStatus) {
        return queryRepository.findAcceptedStudents(pageable, sleepoverStatus);
    }
}