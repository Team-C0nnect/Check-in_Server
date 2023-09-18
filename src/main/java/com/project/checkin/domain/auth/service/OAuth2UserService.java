package com.project.checkin.domain.auth.service;

import com.project.checkin.domain.auth.dto.request.AuthenticationRequest;
import com.project.checkin.domain.auth.dto.response.JsonWebTokenResponse;

public interface OAuth2UserService {
    JsonWebTokenResponse auth(AuthenticationRequest request);
    JsonWebTokenResponse refresh(String token);

}
