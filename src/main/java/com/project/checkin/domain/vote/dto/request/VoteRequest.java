package com.project.checkin.domain.vote.dto.request;

import com.project.checkin.domain.vote.dto.Vote;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class VoteRequest {

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime addDate;

    public Vote toVote(){
        return Vote.builder()
                .startDate(this.startDate)
                .endDate(this.endDate)
                .addDate(this.addDate).build();
    }
}
