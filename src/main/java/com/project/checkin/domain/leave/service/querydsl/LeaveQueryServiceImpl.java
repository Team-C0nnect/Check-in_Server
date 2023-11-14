package com.project.checkin.domain.leave.service.querydsl;

import com.project.checkin.domain.leave.domain.repository.querydsl.LeaveQueryRepository;
import com.project.checkin.domain.leave.dto.response.LeaveResponse;
import com.project.checkin.global.common.dto.request.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LeaveQueryServiceImpl implements LeaveQueryService{
    private final LeaveQueryRepository queryRepository;

    @Override
    public List<LeaveResponse> findLeaves(PageRequest pageRequest) {
        return queryRepository.findLeaves(pageRequest);
    }
}
