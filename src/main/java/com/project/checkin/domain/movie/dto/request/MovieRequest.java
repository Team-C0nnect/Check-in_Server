package com.project.checkin.domain.movie.dto.request;

import com.project.checkin.domain.movie.dto.Movie;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "영화 제목")
@Getter
@Setter
public class MovieRequest {

    @Schema(description = "영화 제목")
    @NotBlank
    private String title;

    public Movie toMovie(){
        return Movie.builder()
                .title(this.title)
                .build();
    }
}
