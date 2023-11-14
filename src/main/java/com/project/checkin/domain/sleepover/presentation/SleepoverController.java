package com.project.checkin.domain.sleepover.presentation;

import com.project.checkin.domain.sleepover.dto.Sleepover;
import com.project.checkin.domain.sleepover.dto.request.SleepoverRequest;
import com.project.checkin.domain.sleepover.dto.request.SleepoverSettingRequest;
import com.project.checkin.domain.sleepover.service.SleepoverService;
import com.project.checkin.domain.sleepover.service.querydsl.SleepoverQueryService;
import com.project.checkin.global.common.dto.request.PageRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "외박", description = "외박")
@SecurityRequirement(name = "BearerAuthentication")
@RestController
@RequiredArgsConstructor
@RequestMapping("/sleepover")
public class SleepoverController {

    private final SleepoverService sleepoverService;
    private final SleepoverQueryService querydslService;

    @Operation(summary = "전체 외박 조회", description = "")
    @GetMapping("/findAllStudents")
    public ResponseEntity<Sleepover> findAllStudents() {
        return ResponseEntity.ok(sleepoverService.find());
    }

    @Operation(summary = "승인 외박 조회", description = "")
    @GetMapping("/findAcceptedStudents")
    public ResponseEntity<Sleepover> findAcceptedStudents(SleepoverRequest request, PageRequest pageRequest) {
        return ResponseEntity.ok((Sleepover) querydslService.findSleepoverStudents(pageRequest, request.getApproval()));
    }

    @Operation(summary = "외박 신청")
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerSleepover(@Validated @RequestBody SleepoverRequest request){
        sleepoverService.registerSleepover(request.toSleepover());
    }

    @Operation(summary = "외박 거절")
    @PutMapping("/refuse")
    @ResponseStatus(HttpStatus.OK)
    public void refuseSleepover(@Validated @RequestBody SleepoverSettingRequest request){
        sleepoverService.refuseSleepover(request.getSleepoverId());
    }

    @Operation(summary = "외박 승인")
    @PutMapping("/accept")
    @ResponseStatus(HttpStatus.OK)
    public void acceptSleepover(@Validated @RequestBody SleepoverSettingRequest request){
        sleepoverService.acceptSleepover(request.getSleepoverId());
    }
}
