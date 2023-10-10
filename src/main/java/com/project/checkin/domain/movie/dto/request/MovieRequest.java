package com.project.checkin.domain.movie.dto.request;

import com.project.checkin.domain.movie.dto.Movie;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "영화 제목")
@Getter
@Setter
public class MovieRequest {

    @Schema(description = "영화 제목")
    private String title;

    public Movie MovieRequest(){
        return Movie.builder()
                .title(this.title)
                .build();
    }
}
