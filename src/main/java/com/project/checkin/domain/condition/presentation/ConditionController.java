package com.project.checkin.domain.condition.presentation;

import com.project.checkin.domain.condition.domain.repository.ConditionRepository;
import com.project.checkin.domain.condition.dto.Condition;
import com.project.checkin.domain.condition.dto.request.ConditionRequest;
import com.project.checkin.domain.condition.service.ConditionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Condtion")
public class ConditionController {
    private final ConditionService conditionService;
    private final ConditionRepository conditionRepository;

    @PostMapping("/today")
    public void register(@Validated @RequestBody ConditionRequest request){
        conditionService.registerMyFeels(request);
    }

    @GetMapping("/find")
    public ResponseEntity<Condition> find(){
        return ResponseEntity.ok(conditionService.find());
    }

}
