package com.project.checkin.domain.sleepover.service;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.sleepover.domain.repository.SleepoverRepository;
import com.project.checkin.domain.sleepover.dto.Sleepover;
import com.project.checkin.domain.sleepover.dto.request.SleepoverRequest;
import com.project.checkin.domain.sleepover.exception.SleepoverAlreadyExistsException;
import com.project.checkin.domain.sleepover.exception.SleepoverNotFoundException;
import com.project.checkin.domain.sleepover.mapper.SleepoverMapper;
import com.project.checkin.global.common.repository.UserSecurity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SleepoverServiceImpl implements SleepoverService{

    private final SleepoverRepository sleepoverRepository;
    private final UserSecurity userSecurity;
    private final SleepoverMapper sleepoverMapper;
    private SleepoverEntity sleepover;
    @Override
    public Sleepover find() {
        return sleepoverRepository
                .findById(sleepover.getId())
                .map(sleepoverMapper::toSleepover)
                .orElseThrow(() -> SleepoverNotFoundException.EXCEPTION);
    }

    @Override
    public void registerSleepover(SleepoverEntity sleepover, SleepoverRequest request){
        if(sleepoverRepository.existsByUserId(sleepover.getUserId())){
            throw SleepoverAlreadyExistsException.EXCEPTION;
        }
        sleepoverRepository.save(sleepover);
    }

}
