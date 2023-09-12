package com.project.checkIn.domain.auth.presentation.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthenticationRequest {

    @NotBlank(message = "")
    private String idToken;

    private String fcmToken;

}
