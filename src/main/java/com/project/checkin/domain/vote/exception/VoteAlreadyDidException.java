package com.project.checkin.domain.vote.exception;

import com.project.checkin.domain.vote.exception.error.VoteError;
import com.project.checkin.global.exception.BusinessException;

public class VoteAlreadyDidException extends BusinessException {

    public static final VoteAlreadyDidException EXCEPTION = new VoteAlreadyDidException();

    private VoteAlreadyDidException(){
        super(VoteError.VOTE_CONFLICT);
    }

}
