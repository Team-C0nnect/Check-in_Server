package com.project.checkin.domain.vote.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_movie_list")
@AllArgsConstructor
@Builder
@Getter
public class MovieListEntity{

    @EmbeddedId
    private MovieListId id;

}
