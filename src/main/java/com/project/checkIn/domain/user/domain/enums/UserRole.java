package com.project.checkIn.domain.user.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {

    USER("USER"),
    MANAGER("manager"),
    ADMIN("admin");

    private final String key;

}
