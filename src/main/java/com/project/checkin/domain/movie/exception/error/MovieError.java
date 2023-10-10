package com.project.checkin.domain.movie.exception.error;

import com.project.checkin.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum MovieError implements ErrorProperty {

    MOVIE_CONFLICT(HttpStatus.CONFLICT, "영화가 이미 있습니다"),
    MOVIE_NOT_FOUND(HttpStatus.NOT_FOUND, "영화를 찾을 수 없습니다");

    private final HttpStatus status;
    private final String message;



}
