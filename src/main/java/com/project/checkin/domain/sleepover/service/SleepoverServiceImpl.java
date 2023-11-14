package com.project.checkin.domain.sleepover.service;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.domain.repository.SleepoverRepository;
import com.project.checkin.domain.sleepover.dto.Sleepover;
import com.project.checkin.domain.sleepover.dto.request.SleepoverRequest;
import com.project.checkin.domain.sleepover.exception.SleepoverAlreadyExistsException;
import com.project.checkin.domain.sleepover.exception.SleepoverNotFoundException;
import com.project.checkin.domain.sleepover.mapper.SleepoverMapper;
import com.project.checkin.global.common.repository.UserSecurity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class SleepoverServiceImpl implements SleepoverService {

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
    public void registerSleepover(Sleepover sleepover) {
        if (sleepoverRepository.findById(userSecurity.getUser().getId()).isPresent()) {
            throw SleepoverAlreadyExistsException.EXCEPTION;
        }
        sleepoverRepository.save(sleepoverMapper.toCreate(sleepover));
    }

    @Override
    public void refuseSleepover(Long sleepoverId) {

        Sleepover sleepover = sleepoverRepository.findById(sleepoverId).map(sleepoverMapper::toSleepover).orElseThrow(() -> SleepoverNotFoundException.EXCEPTION);
        sleepover.setApproval(SleepoverStatus.SLEEPOVER_REJECTED);
        sleepoverRepository.save(sleepoverMapper.toCreate(sleepover));

    }

    @Override
    public void acceptSleepover(Long sleepoverId){

        Sleepover sleepover = sleepoverRepository.findById(sleepoverId).map(sleepoverMapper::toSleepover).orElseThrow(() -> SleepoverNotFoundException.EXCEPTION);
        sleepover.setApproval(SleepoverStatus.SLEEPOVER_ACCEPTED);
        sleepoverRepository.save(sleepoverMapper.toCreate(sleepover));
    }

}
