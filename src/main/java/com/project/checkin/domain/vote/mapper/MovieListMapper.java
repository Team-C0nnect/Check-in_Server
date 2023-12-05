package com.project.checkin.domain.vote.mapper;

import com.project.checkin.domain.vote.domain.MovieListEntity;
import com.project.checkin.domain.vote.dto.MovieList;
import org.springframework.stereotype.Component;

@Component
public class MovieListMapper {
    public MovieList toMovieList(MovieListEntity entity) {
        return MovieList.builder()
                .movieListId(entity.getId())
                .build();
    }

    public MovieListEntity toCreate(MovieList movieList) {
        return MovieListEntity.builder()
                .id(movieList.getMovieListId())
                .build();
    }

}
