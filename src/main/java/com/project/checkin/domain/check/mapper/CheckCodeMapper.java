package com.project.checkin.domain.check.mapper;


import com.project.checkin.domain.check.domain.CheckCodeEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CheckCodeMapper {
    public CheckCodeEntity createCheckCodeEntity(final Long userId) {
        return CheckCodeEntity.builder()
                .userId(userId)
                .code(UUID.randomUUID().toString().replace("-", ""))
                .valid(true)
                .build();
    }
}
