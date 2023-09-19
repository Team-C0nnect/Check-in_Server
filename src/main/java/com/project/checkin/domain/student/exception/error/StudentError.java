package com.project.checkin.domain.student.exception.error;

import com.project.checkin.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum StudentError implements ErrorProperty {

    STUDENT_CONFLICT(HttpStatus.CONFLICT, "학생이 이미 존재합니다."),
    STUDENT_NOT_FOUND(HttpStatus.NOT_FOUND, "학생을 찾을 수 없습니다.");

    private final HttpStatus status;
    private final String message;
}
