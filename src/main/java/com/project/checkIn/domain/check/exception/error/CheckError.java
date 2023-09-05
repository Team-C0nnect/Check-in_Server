package com.project.checkIn.domain.check.exception.error;

import com.project.checkIn.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum CheckError implements ErrorProperty{

    CHECK_CONFLICT(HttpStatus.CONFLICT, "이미 처리 된 요청입니다."), // 이미 출석 했을 때,
    QR_NOT_AVAILABLE(HttpStatus.SERVICE_UNAVAILABLE,"유효하지 않은 QR 코드입니다."); // 유효하지 않은 QR코드거나 이미 기간이 지난 QR코드일 때

    private final HttpStatus status;
    private final String message;

}
