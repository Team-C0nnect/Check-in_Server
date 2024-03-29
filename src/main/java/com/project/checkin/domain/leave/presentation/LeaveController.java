package com.project.checkin.domain.leave.presentation;

import com.project.checkin.domain.leave.dto.request.LeaveRegisterRequest;
import com.project.checkin.domain.leave.dto.request.LeaveRequest;
import com.project.checkin.domain.leave.dto.response.LeaveResponse;
import com.project.checkin.domain.leave.service.LeaveService;
import com.project.checkin.domain.leave.service.querydsl.LeaveQueryService;
import com.project.checkin.global.common.dto.request.PageRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "퇴사주", description = "퇴사주")
@RestController
@RequiredArgsConstructor
@RequestMapping("/leave")
public class LeaveController {

    private final LeaveService leaveService;
    private final LeaveQueryService leaveQueryService;

    @Operation(summary = "퇴사주 등록", description = "퇴사주를 등록합니다")
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerLeaveWeek(@Validated @RequestBody LeaveRegisterRequest request) {
        leaveService.registerLeaveWeek(request.toLeave());
    }

    @Operation(summary = "퇴사주 삭제", description = "퇴사주를 삭제합니다")
    @DeleteMapping("")
    @ResponseStatus(HttpStatus.OK)
    public void refuseLeaveWeek(@Validated @RequestBody LeaveRequest request) {
        leaveService.removeLeaveWeek(request.getId());
    }

    @Operation(summary = "퇴사주 조회", description = "퇴사주를 조회합니다")
    @GetMapping("")
    public List<LeaveResponse> findLeaves(PageRequest request) {
        return leaveQueryService.findLeaves(request);
    }
}
