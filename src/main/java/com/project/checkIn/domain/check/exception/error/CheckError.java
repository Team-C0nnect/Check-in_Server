package com.project.checkIn.domain.check.exception.error;

import com.project.checkIn.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum CheckError implements ErrorProperty{

    CHECK_CONFLICT(HttpStatus.CONFLICT, "이미 처리 된 요청입니다."),
    QR_NOT_FOUND(HttpStatus.NOT_FOUND,"유효하지 않은 QR 코드입니다.");

    private final HttpStatus status;
    private final String message;

}
