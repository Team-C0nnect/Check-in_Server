package com.project.checkin.domain.sleepover.service.querydsl;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.domain.repository.querydsl.SleepoverQueryRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuerydslServiceImpl implements QuerydslService{
    SleepoverQueryRepositoryImpl queryRepository;
    @Override
    public Page<SleepoverEntity> findSleepoverStudents(Pageable pageable, SleepoverStatus sleepoverStatus) {
        return queryRepository.findAcceptedStudents(pageable, sleepoverStatus);
    }
}