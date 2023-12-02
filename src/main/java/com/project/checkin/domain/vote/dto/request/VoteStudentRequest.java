package com.project.checkin.domain.vote.dto.request;

import com.project.checkin.domain.vote.domain.MovieListId;
import com.project.checkin.domain.vote.dto.VoteStudent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoteStudentRequest {

    private MovieListId id;
    private Long userId;

    public VoteStudent toVoteStudent(){
        return VoteStudent.builder()
                .id(this.id)
                .userId(this.userId)
                .build();
    }
}
