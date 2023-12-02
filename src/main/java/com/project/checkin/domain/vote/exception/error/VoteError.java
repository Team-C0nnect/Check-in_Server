package com.project.checkin.domain.vote.exception.error;

import com.project.checkin.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum VoteError implements ErrorProperty {
    VOTE_CONFLICT(HttpStatus.CONFLICT, "이미 투표를 진행하셨습니다.");

    private final HttpStatus status;
    private final String message;
}
