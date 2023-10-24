package com.project.checkin.domain.condition.exception.error;

import com.project.checkin.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
@Getter
@RequiredArgsConstructor
public enum ConditionError implements ErrorProperty {
    CONDITION_CONFLICT(HttpStatus.CONFLICT,"컨디션 체크는 하루에 한 번만 가능합니다."),
    CONDITION_NOT_SELECTED(HttpStatus.BAD_REQUEST,"오늘의 컨디션 체크를 진행하지 않으셨습니다.");

    private final HttpStatus status;
    private final String message;
}
