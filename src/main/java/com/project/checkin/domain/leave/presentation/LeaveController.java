package com.project.checkin.domain.leave.presentation;

import com.project.checkin.domain.leave.dto.Leave;
import com.project.checkin.domain.leave.dto.request.LeaveRegisterRequest;
import com.project.checkin.domain.leave.dto.request.LeaveRequest;
import com.project.checkin.domain.leave.dto.response.LeaveResponse;
import com.project.checkin.domain.leave.service.LeaveService;
import com.project.checkin.domain.leave.service.querydsl.LeaveQueryService;
import com.project.checkin.global.common.dto.request.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.method.P;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/leave")
public class LeaveController {
    private final LeaveService leaveService;
    private final LeaveQueryService leaveQueryService;
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerLeaveWeek(@Validated @RequestBody LeaveRegisterRequest request){
        leaveService.registerLeaveWeek(request.toLeave());
    }

    @DeleteMapping("")
    @ResponseStatus(HttpStatus.OK)
    public void refuseLeaveWeek(@Validated @RequestBody LeaveRequest request){
        leaveService.removeLeaveWeek(request.getId());
    }

    @GetMapping("")
    public List<LeaveResponse> findLeaves(PageRequest request){
        return leaveQueryService.findLeaves(request);
    }
}
