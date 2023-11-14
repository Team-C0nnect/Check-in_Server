package com.project.checkin.domain.condition.presentation;

import com.project.checkin.domain.condition.dto.Condition;
import com.project.checkin.domain.condition.dto.request.ConditionRequest;
import com.project.checkin.domain.condition.service.ConditionService;
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

@RestController
@RequiredArgsConstructor
@RequestMapping("/condtion")
public class ConditionController {
    private final ConditionService conditionService;

    @GetMapping("")
    public ResponseEntity<Condition> find() {
        return ResponseEntity.ok(conditionService.find());
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@Validated @RequestBody ConditionRequest request){
        conditionService.registerMyFeels(request.toCondition());
    }

}
