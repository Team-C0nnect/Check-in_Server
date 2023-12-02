package com.project.checkin.domain.vote.domain;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class MovieListId implements Serializable {
    private Long movieId;
    private Long voteId;
}
