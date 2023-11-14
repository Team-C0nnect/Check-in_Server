package com.project.checkin.domain.check.exception.error;

import com.project.checkin.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum CheckError implements ErrorProperty {

    CHECK_CONFLICT(HttpStatus.CONFLICT, "이미 출석 체크가 완료된 회원입니다.");

    private final HttpStatus status;
    private final String message;

}
