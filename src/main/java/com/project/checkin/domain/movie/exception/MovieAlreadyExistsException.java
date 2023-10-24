package com.project.checkin.domain.movie.exception;

import com.project.checkin.domain.movie.exception.error.MovieError;
import com.project.checkin.global.exception.BusinessException;

public class MovieAlreadyExistsException extends BusinessException {

    public static final MovieAlreadyExistsException EXCEPTION = new MovieAlreadyExistsException();

    private MovieAlreadyExistsException(){
        super(MovieError.MOVIE_CONFLICT);
    }
}
