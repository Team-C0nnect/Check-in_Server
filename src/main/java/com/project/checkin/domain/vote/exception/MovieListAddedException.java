package com.project.checkin.domain.vote.exception;

import com.project.checkin.domain.vote.exception.error.MovieListError;
import com.project.checkin.global.exception.BusinessException;

public class MovieListAddedException extends BusinessException {

    public static final MovieListAddedException EXCEPTION = new MovieListAddedException();

    private MovieListAddedException(){super(MovieListError.MOVIE_LIST_CONFLICT);}

}
