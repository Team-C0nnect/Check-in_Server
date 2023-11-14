package com.project.checkin.domain.movie.domain.repository.querydsl;

import com.project.checkin.domain.movie.dto.Movie;
import com.project.checkin.domain.movie.dto.request.MoviePageRequest;

import java.util.List;

public interface MovieQueryRepository {
    List<Movie> findMovies(MoviePageRequest moviePageRequest) ;

}
