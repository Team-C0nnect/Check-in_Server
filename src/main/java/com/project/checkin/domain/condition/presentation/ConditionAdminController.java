package com.project.checkin.domain.condition.presentation;

import com.project.checkin.domain.condition.dto.Condition;
import com.project.checkin.domain.condition.dto.request.ConditionPageRequest;
import com.project.checkin.domain.condition.service.querydsl.ConditionQueryService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/condition-admin")
public class ConditionAdminController {

    private final ConditionQueryService conditionQueryService;

    @Operation(summary = "컨디션 조회", description = "컨디션을 조회합니다")
    @GetMapping("")
    public ResponseEntity<List<Condition>> find(ConditionPageRequest conditionPageRequest) {
        return ResponseEntity.ok(conditionQueryService.findByFeels(conditionPageRequest));
    }

}
