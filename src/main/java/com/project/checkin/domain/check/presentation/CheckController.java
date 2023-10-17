package com.project.checkin.domain.check.presentation;

import com.project.checkin.domain.check.dto.Check;
import com.project.checkin.domain.check.service.querydsl.CheckQueryService;
import com.project.checkin.global.common.dto.request.PageRequest;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/attendance")
@RequiredArgsConstructor
public class CheckController {

    private final CheckQueryService checkQueryService;

    @Operation(summary = "출석 명단", description = "출석 명단을 표시합니다")
    @GetMapping("/list")
    public ResponseEntity<List<Check>> findCheck(PageRequest pageRequest){
        return ResponseEntity.status(HttpStatus.OK).body(checkQueryService.findCheck(pageRequest));
    }
}
