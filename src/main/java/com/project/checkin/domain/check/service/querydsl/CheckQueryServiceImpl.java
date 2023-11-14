package com.project.checkin.domain.check.service.querydsl;

import com.project.checkin.domain.check.domain.repository.querydsl.CheckQueryRepository;
import com.project.checkin.domain.check.dto.Check;
import com.project.checkin.global.common.dto.request.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CheckQueryServiceImpl implements CheckQueryService {

    private final CheckQueryRepository checkQueryRepository;

    public List<String> findAllNonCheckUser(PageRequest pageRequest) {
        return checkQueryRepository.findAllNonCheckUser(pageRequest);
    }

    @Override
    public List<Check> findCheck(PageRequest pageRequest) {
        return checkQueryRepository.findCheck(pageRequest);
    }
}
