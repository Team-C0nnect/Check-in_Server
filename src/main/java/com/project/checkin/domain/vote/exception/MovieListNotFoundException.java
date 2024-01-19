package com.project.checkin.domain.vote.exception;

import com.project.checkin.domain.vote.exception.error.MovieListError;
import com.project.checkin.global.exception.BusinessException;

public class MovieListNotFoundException extends BusinessException {
    public static final MovieListNotFoundException EXCEPTION = new MovieListNotFoundException();

    private MovieListNotFoundException(){
        super(MovieListError.MOVIE_LIST_NOT_FOUND);
    }

}
