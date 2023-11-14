package com.project.checkin.domain.leave.service.querydsl;

import com.project.checkin.domain.leave.dto.Leave;
import com.project.checkin.domain.leave.dto.response.LeaveResponse;
import com.project.checkin.global.common.dto.request.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LeaveQueryService {
    List<LeaveResponse> findLeaves(PageRequest pageRequest);
}
