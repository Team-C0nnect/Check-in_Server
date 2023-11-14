package com.project.checkin.domain.check.service;

import com.project.checkin.domain.check.domain.CheckEntity;
import com.project.checkin.domain.check.domain.repository.CheckRepository;
import com.project.checkin.domain.check.exception.CheckAlreadyExistsException;
import com.project.checkin.domain.check.mapper.CheckMapper;
import com.project.checkin.global.common.repository.UserSecurity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class CheckServiceImpl implements CheckService {

    private final CheckRepository checkRepository;
    private final CheckMapper checkMapper;
    private final UserSecurity userSecurity;

    @Override
    public void attendance() {
        CheckEntity checkEntity = checkMapper.createCheckEntity(userSecurity.getUser().getId(), LocalDate.now());
        if (checkRepository.findByUserIdAndCheckDate(checkEntity.getUserId(), checkEntity.getCheckDate()).isPresent()) {
            throw CheckAlreadyExistsException.EXCEPTION;
        }
        checkRepository.save(checkEntity);
    }

}
