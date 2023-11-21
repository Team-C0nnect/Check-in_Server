package com.project.checkin.domain.check.service;

import com.project.checkin.domain.check.domain.CheckCodeEntity;
import com.project.checkin.domain.check.domain.repository.CheckCodeRepository;
import com.project.checkin.domain.check.dto.response.CheckCodeResponse;
import com.project.checkin.domain.check.mapper.CheckCodeMapper;
import com.project.checkin.global.common.repository.UserSecurity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
@Service
@RequiredArgsConstructor
public class CheckCodeServiceImpl implements CheckCodeService {

    private final CheckCodeRepository checkCodeRepository;
    private final UserSecurity userSecurity;
    private final CheckCodeMapper checkCodeMapper;

    @Override
    public CheckCodeResponse generate() {
        CheckCodeEntity checkCodeEntity = checkCodeRepository.save(checkCodeMapper.createCheckCodeEntity(1L));
        return CheckCodeResponse.builder().code(checkCodeEntity.getCode()).build();
    }

}
