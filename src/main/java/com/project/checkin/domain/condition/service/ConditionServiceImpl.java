package com.project.checkin.domain.condition.service;

import com.project.checkin.domain.condition.domain.repository.ConditionRepository;
import com.project.checkin.domain.condition.dto.Condition;
import com.project.checkin.domain.condition.exception.ConditionAlreadyDidException;
import com.project.checkin.domain.condition.mapper.ConditionMapper;
import com.project.checkin.global.common.repository.UserSecurity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ConditionServiceImpl implements ConditionService{
    ConditionRepository conditionRepository;
    UserSecurity userSecurity;
    ConditionMapper conditionMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Condition find(){
        return conditionRepository
                .findById(userSecurity.getUser().getId())
                .map(conditionMapper::toCondition)
                .orElseThrow(() -> ConditionAlreadyDidException.EXCEPTION);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void
    registerMyFeels(Condition condition) {
        if(conditionRepository.findByUserIdAndEndDateTime(condition.getUserId(),condition.getEndDateTime()).isPresent()){
            throw ConditionAlreadyDidException.EXCEPTION;
        }
        conditionRepository.save(conditionMapper.toCreate(condition));
    }
}
