package com.project.checkin.domain.vote.mapper;

import com.project.checkin.domain.vote.domain.VoteStudentEntity;
import com.project.checkin.domain.vote.dto.VoteStudent;
import com.project.checkin.domain.vote.service.VoteStudentService;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class VoteStudentMapper {

    public VoteStudent toVoteStudent(VoteStudentEntity entity) {
        return VoteStudent.builder()
                .id(entity.getId())
                .userId(entity.getUserId())
                .voteDate(entity.getVotedDate())
                .build();
    }

    public VoteStudentEntity toUpdate(VoteStudent voteStudent) {
        return VoteStudentEntity.builder()
                .id(voteStudent.getId())
                .userId(voteStudent.getUserId())
                .votedDate(LocalDateTime.now())
                .build();
    }

    public VoteStudentEntity toCreate(VoteStudent voteStudent) {
        return VoteStudentEntity.builder()
                .userId(voteStudent.getUserId())
                .votedDate(LocalDateTime.now())
                .build();
    }

}
