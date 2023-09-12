package com.project.checkIn.domain.user.presentation;

import com.project.checkIn.domain.user.presentation.dto.response.UserResponse;
import com.project.checkIn.domain.user.service.FindUserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

    private final FindUserInfoService findUserInfoService;

    @GetMapping("/info")
    public UserResponse findUserInfo(){
        return findUserInfoService.execute();
    }
}