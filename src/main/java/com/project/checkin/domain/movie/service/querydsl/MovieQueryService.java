package com.project.checkin.domain.movie.service.querydsl;

import com.project.checkin.domain.movie.dto.Movie;
import com.project.checkin.global.common.dto.request.PageRequest;

import java.util.List;

public interface MovieQueryService {
    List<Movie> findMovies(PageRequest pageRequest);

}
