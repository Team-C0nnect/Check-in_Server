package com.project.checkin.domain.check.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class CheckCodeResponse {
    private String code;
}
