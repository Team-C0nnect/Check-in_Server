package com.project.checkin.domain.sleepover.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SleepoverStatus {
    SLEEPOVER_ACCEPTED("승인 됨"),
    SLEEPOVER_REJECTED("거절 됨"),
    SLEEPOVER_WAITING("대기 중");

    private final String key;
}
