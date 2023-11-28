package com.project.checkin.domain.check.service;

import com.project.checkin.domain.check.domain.CheckEntity;
import com.project.checkin.domain.check.domain.repository.CheckCodeRepository;
import com.project.checkin.domain.check.domain.repository.CheckRepository;
import com.project.checkin.domain.check.dto.request.CodeRequest;
import com.project.checkin.domain.check.exception.CheckAlreadyExistsException;
import com.project.checkin.domain.check.exception.CheckCodeError;
import com.project.checkin.domain.check.mapper.CheckMapper;
import com.project.checkin.global.common.repository.UserSecurity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class CheckServiceImpl implements CheckService {

    private final CheckRepository checkRepository;
    private final CheckCodeRepository checkCodeRepository;
    private final CheckMapper checkMapper;
    private final UserSecurity userSecurity;

    @Override
    public void attendance(CodeRequest codeRequest) {

        CheckEntity checkEntity = checkMapper.createCheckEntity(userSecurity.getUser().getId(), LocalDate.now());

        if (checkRepository.findByUserIdAndCheckDate(checkEntity.getUserId(), checkEntity.getCheckDate()).isPresent()) {
            throw CheckAlreadyExistsException.EXCEPTION;
        }

        if (checkCodeRepository.existsByCodeAndValid(codeRequest.getCode(), true)) {
            checkRepository.save(checkEntity);
        } else {
            throw CheckCodeError.EXCEPTION;
        }

    }

    @Override
    public ResponseEntity<Void> attendanceCheck() {
        return (checkRepository.existsById(userSecurity.getUser().getId())) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

}
