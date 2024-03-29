package com.project.checkin.domain.sleepover.presentation;

import com.project.checkin.domain.sleepover.dto.request.SleepoverRequest;
import com.project.checkin.domain.sleepover.service.SleepoverService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
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

    @Operation(summary = "외박 신청")
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerSleepover(@Validated @RequestBody SleepoverRequest request){
        sleepoverService.registerSleepover(request.toSleepover());
    }

}
