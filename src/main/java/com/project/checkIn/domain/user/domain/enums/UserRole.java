package com.project.checkIn.domain.user.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {
    USER("ROLE_USER"),
    MANAGER("ROLE_MANAGER"),
    ADMIN("ROLE_ADMIN");
    private final String key;
}
