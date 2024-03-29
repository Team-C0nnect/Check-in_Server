package com.project.checkin.domain.sleepover.exception.error;

import com.project.checkin.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
@Getter
@RequiredArgsConstructor
public enum SleepoverError implements ErrorProperty {

    SLEEPOVER_CONFLICT(HttpStatus.CONFLICT,"이미 존재하는 외박 요청."),
    SLEEPOVER_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 외박 요청을 찾을 수 없습니다."),
    SLEEPOVER_BAD_REQUEST(HttpStatus.BAD_REQUEST,"잘못된 형식.");



    private final HttpStatus status;
    private final String message;

}
