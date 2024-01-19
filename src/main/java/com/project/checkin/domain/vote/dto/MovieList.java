package com.project.checkin.domain.vote.dto;

import com.project.checkin.domain.vote.domain.MovieListId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieList {
    private MovieListId movieListId;
}
