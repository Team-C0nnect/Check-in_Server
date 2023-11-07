package com.project.checkin.domain.movie.mapper;

import com.project.checkin.domain.movie.domain.MovieEntity;
import com.project.checkin.domain.movie.dto.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {
    public MovieEntity createMovieEntity(Long userId, Movie movie){
        return MovieEntity.builder().userId(userId).title(movie.getTitle()).build();
    }
}
