package com.project.checkin.domain.vote.service;

import com.project.checkin.domain.vote.dto.VoteStudent;

public interface VoteStudentService {
    void vote(VoteStudent student);

    void update(VoteStudent student);
}
