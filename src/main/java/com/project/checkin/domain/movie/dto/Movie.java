package com.project.checkin.domain.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie {

    private Long id;
    private Long userId;
    private String title;
    private String manufactureYear;

}
