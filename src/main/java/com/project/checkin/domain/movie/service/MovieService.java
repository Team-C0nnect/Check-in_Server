package com.project.checkin.domain.movie.service;

import com.project.checkin.domain.movie.domain.MovieEntity;
import com.project.checkin.domain.movie.dto.request.MovieRequest;

public interface MovieService {

    void register(MovieRequest movieRequest, MovieEntity movie);
}
