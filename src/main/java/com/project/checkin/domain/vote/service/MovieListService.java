package com.project.checkin.domain.vote.service;

import com.project.checkin.domain.vote.dto.MovieList;

public interface MovieListService {

    void register(MovieList movieList);
    void refuse(MovieList movieList);

}
