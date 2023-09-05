package com.project.checkIn.domain.user.exception.error;

import com.project.checkIn.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum UserError implements ErrorProperty {

    USER_CONFLICT(HttpStatus.CONFLICT, "유저가 이미 존재 합니다."),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "유저를 찾을 수 없습니다");

    private final HttpStatus status;
    private final String message;
}
