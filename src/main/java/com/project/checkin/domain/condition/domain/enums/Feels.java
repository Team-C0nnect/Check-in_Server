package com.project.checkin.domain.condition.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Feels {
    GOOD("FEELS_GOOD"),
    BAD("FEELS_BAD"),
    SAD("FEELS_SAD"),
    ANGRY("FEELS_ANGRY"),
    PERFECT("FEELS_PERFECT");
    private final String key;
}
