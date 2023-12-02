package com.project.checkin.domain.vote.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_user_vote")
@AllArgsConstructor
@Builder
public class VoteStudentEntity {

    @EmbeddedId
    private MovieListId id;
    private Long userId;
    private LocalDateTime votedDate;

}
