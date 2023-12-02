package com.project.checkin.domain.vote.mapper;

import com.project.checkin.domain.vote.domain.MovieListEntity;
import com.project.checkin.domain.vote.dto.MovieList;

public class MoveListMapper {

    public MovieList toMovieList(MovieListEntity entity){
        return MovieList.builder()
                .movieListId(entity.getId())
                .build();
    }

}
