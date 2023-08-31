package com.project.checkIn.domain.user.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserType {

    ROLE_USER("USER"),
    ROLE_MANAGER("manager"),
    ROLE_ADMIN("admin");

    private final String role;

}
