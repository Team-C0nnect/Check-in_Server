package com.project.checkin.domain.movie.exception;

import com.project.checkin.domain.movie.exception.error.MovieError;
import com.project.checkin.global.exception.BusinessException;

public class MovieNotFoundException extends BusinessException {
    public static final MovieNotFoundException EXCEPTION = new MovieNotFoundException();

    private MovieNotFoundException(){
        super(MovieError.MOVIE_NOT_FOUND);
    }
}
