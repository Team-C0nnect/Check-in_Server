package com.project.checkin.domain.vote.mapper;

import com.project.checkin.domain.vote.domain.VoteEntity;
import com.project.checkin.domain.vote.dto.Vote;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class VoteMapper {

    public Vote toVote(VoteEntity entity) {
        return Vote.builder()
                .id(entity.getId())
                .startDate(entity.getStartDate())
                .endDate(entity.getEndDate())
                .addDate(entity.getAddDate())
                .build();
    }

    public VoteEntity toCreate(Vote vote) {
        return VoteEntity.builder()
                .startDate(vote.getStartDate())
                .endDate(vote.getEndDate())
                .addDate(LocalDateTime.now())
                .build();
    }
}
