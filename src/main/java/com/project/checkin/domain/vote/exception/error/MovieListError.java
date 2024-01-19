package com.project.checkin.domain.vote.exception.error;

import com.project.checkin.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum MovieListError implements ErrorProperty {

    MOVIE_LIST_CONFLICT(HttpStatus.CONFLICT,"이미 추가되었습니다."),
    MOVIE_LIST_NOT_FOUND(HttpStatus.NOT_FOUND,"찾을 수 없습니다.");

    private final HttpStatus status;
    private final String message;

}
