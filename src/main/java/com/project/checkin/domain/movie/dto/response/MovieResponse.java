package com.project.checkin.domain.movie.dto.response;

import com.project.checkin.domain.movie.domain.MovieEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MovieResponse {

    private String title;
//
//    public static MovieResponse of(MovieEntity movie){
//        return MovieResponse.builder()
//                .title(movie.getTitle())
//                .build();
//    }

}
