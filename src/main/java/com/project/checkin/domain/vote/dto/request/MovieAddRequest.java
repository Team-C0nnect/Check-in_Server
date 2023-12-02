package com.project.checkin.domain.vote.dto.request;

import com.project.checkin.domain.vote.domain.MovieListId;
import com.project.checkin.domain.vote.dto.MovieList;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieAddRequest {

    @NotBlank
    private MovieListId movieListId;

    public MovieList toMovieList(){
        return MovieList.builder().movieListId(this.movieListId).build();
    }
}
