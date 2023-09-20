package com.project.checkIn.domain.auth.presentation;

import com.project.checkIn.domain.auth.presentation.dto.request.AuthenticationRequest;
import com.project.checkIn.domain.auth.presentation.dto.request.RefreshTokenRequest;
import com.project.checkIn.domain.auth.presentation.dto.response.JsonWebTokenResponse;
import com.project.checkIn.domain.auth.service.OAuth2UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final OAuth2UserService oAuth2UserService;
    @PostMapping("")
    public JsonWebTokenResponse auth(@Validated @RequestBody AuthenticationRequest authRequest){
        return oAuth2UserService.auth(authRequest);
    }

    @PostMapping("/refresh")
    public JsonWebTokenResponse refresh(@Validated @RequestBody RefreshTokenRequest refreshTokenRequest){
        return oAuth2UserService.refresh(refreshTokenRequest.getRefreshToken());
    }

}
