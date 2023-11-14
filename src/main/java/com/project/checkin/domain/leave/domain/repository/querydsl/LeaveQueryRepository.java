package com.project.checkin.domain.leave.domain.repository.querydsl;

import com.project.checkin.domain.leave.dto.response.LeaveResponse;
import com.project.checkin.global.common.dto.request.PageRequest;
import org.springframework.data.domain.Page;

import java.util.List;

public interface LeaveQueryRepository {
    List<LeaveResponse> findLeaves(PageRequest request);

}
