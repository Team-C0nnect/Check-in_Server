package com.project.checkin.domain.sleepover.presentation;

import com.project.checkin.domain.sleepover.dto.Sleepover;
import com.project.checkin.domain.sleepover.dto.request.SleepoverRequest;
import com.project.checkin.domain.sleepover.service.SleepoverService;
import com.project.checkin.domain.sleepover.service.querydsl.QuerydslService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "외박", description = "외박")
@RestController
@RequiredArgsConstructor
@RequestMapping("/sleepover")
public class SleepoverController {

    private final SleepoverService sleepoverService;
    private final QuerydslService querydslService;

    @Operation(summary = "전체 외박 조회", description = "")
    @GetMapping("/findAllStudents")
    public ResponseEntity<Sleepover> findAllStudents(){return ResponseEntity.ok(sleepoverService.find());}

    @Operation(summary = "승인 외박 조회", description = "")
    @GetMapping("/findAcceptedStudents")
    public ResponseEntity<Sleepover> findAcceptedStudents(SleepoverRequest request){
        return ResponseEntity.ok((Sleepover) querydslService.findSleepoverStudents(Pageable.unpaged(),request.getApproval()));
    }


}
