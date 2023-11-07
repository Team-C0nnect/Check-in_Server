package com.project.checkin.domain.movie.service.querydsl;

import com.project.checkin.domain.movie.dto.Movie;
import com.project.checkin.domain.movie.dto.request.MoviePageRequest;

import java.util.List;

public interface MovieQueryService {
    List<Movie> findMovies(MoviePageRequest moviePageRequest);
}
