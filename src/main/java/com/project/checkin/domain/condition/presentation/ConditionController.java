package com.project.checkin.domain.condition.presentation;

import com.project.checkin.domain.condition.dto.Condition;
import com.project.checkin.domain.condition.dto.request.ConditionPageRequest;
import com.project.checkin.domain.condition.dto.request.ConditionRequest;
import com.project.checkin.domain.condition.service.ConditionService;
import com.project.checkin.domain.condition.service.querydsl.ConditionQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "컨디션", description = "컨디션")
@RestController
@RequiredArgsConstructor
@RequestMapping("/condition")
public class ConditionController {

    private final ConditionService conditionService;

    @Operation(summary = "컨디션 등록", description = "컨디션을 등록합니다")
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@Validated @RequestBody ConditionRequest request){
        conditionService.registerMyFeels(request.toCondition());
    }

}
