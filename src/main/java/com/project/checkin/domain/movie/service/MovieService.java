package com.project.checkin.domain.movie.service;

import com.project.checkin.domain.movie.domain.MovieEntity;
import com.project.checkin.domain.movie.dto.Movie;
import com.project.checkin.domain.movie.dto.request.MovieRequest;
import com.project.checkin.domain.movie.dto.response.MovieResponse;

public interface MovieService {

    void register(Movie movie);

}
