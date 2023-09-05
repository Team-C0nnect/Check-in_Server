package com.project.checkIn.domain.auth.presentation.responce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserTokenResponse {

    private String accessToken;
    private String refreshToken;
    private String name;

}
