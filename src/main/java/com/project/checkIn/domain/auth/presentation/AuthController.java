package com.project.checkIn.domain.auth.presentation;

import com.project.checkIn.domain.auth.presentation.request.UserSignUpRequest;
import com.project.checkIn.domain.auth.service.UserSignUpService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserSignUpService userSignUpService;

    @PostMapping("/user/sign-up")
    @ResponseStatus(HttpStatus.CREATED)
    public void signUp(@RequestBody UserSignUpRequest request){
        userSignUpService.execute(request);
    }
}
