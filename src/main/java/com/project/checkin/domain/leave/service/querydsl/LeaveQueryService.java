package com.project.checkin.domain.leave.service.querydsl;

import com.project.checkin.domain.leave.dto.Leave;
import com.project.checkin.domain.leave.dto.response.LeaveResponse;
import com.project.checkin.global.common.dto.request.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LeaveQueryService {
    Page<LeaveResponse> findLeaves(PageRequest pageRequest);
}
