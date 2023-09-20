package com.project.checkIn.domain.auth.service;

import com.project.checkIn.domain.auth.presentation.dto.request.AuthenticationRequest;
import com.project.checkIn.domain.auth.presentation.dto.request.RefreshTokenRequest;
import com.project.checkIn.domain.auth.presentation.dto.response.JsonWebTokenResponse;

public interface OAuth2UserService {
    JsonWebTokenResponse auth(AuthenticationRequest request);
    JsonWebTokenResponse refresh(String token);
}
