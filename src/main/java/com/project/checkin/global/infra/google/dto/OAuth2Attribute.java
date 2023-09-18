package com.project.checkin.global.infra.google.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OAuth2Attribute {
    private String email;
    private String email_verified;
    private String name;
}
