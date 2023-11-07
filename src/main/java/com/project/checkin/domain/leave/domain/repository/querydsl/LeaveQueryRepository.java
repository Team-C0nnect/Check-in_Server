package com.project.checkin.domain.leave.domain.repository.querydsl;

import com.project.checkin.domain.leave.dto.response.LeaveResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LeaveQueryRepository {
    Page<LeaveResponse> findLeaves(Pageable pageable);

}
