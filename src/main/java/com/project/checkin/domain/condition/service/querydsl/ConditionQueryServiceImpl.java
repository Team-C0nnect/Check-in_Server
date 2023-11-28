package com.project.checkin.domain.condition.service.querydsl;


import com.project.checkin.domain.condition.domain.repository.querydsl.ConditionQueryRepository;
import com.project.checkin.domain.condition.dto.Condition;
import com.project.checkin.domain.condition.dto.request.ConditionPageRequest;
import com.project.checkin.domain.condition.service.ConditionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ConditionQueryServiceImpl implements ConditionQueryService {

    private final ConditionQueryRepository queryRepository;

    @Override
    public List<Condition> findByFeels(ConditionPageRequest pageRequest) {
        return queryRepository.findByFeels(pageRequest);
    }

}
