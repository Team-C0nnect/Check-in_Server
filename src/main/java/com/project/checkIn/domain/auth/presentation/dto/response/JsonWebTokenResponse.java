package com.project.checkIn.domain.auth.presentation.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class JsonWebTokenResponse {
    private String accessToken;
    private String refreshToken;
}
