package com.project.checkin.domain.vote.service;

import com.project.checkin.domain.vote.domain.repository.VoteStudentRepository;
import com.project.checkin.domain.vote.dto.VoteStudent;
import com.project.checkin.domain.vote.exception.VoteAlreadyDidException;
import com.project.checkin.domain.vote.mapper.VoteStudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class VoteStudentServiceImpl implements VoteStudentService {

    private final VoteStudentRepository repository;
    private final VoteStudentMapper voteStudentMapper;

    @Override
    public void vote(VoteStudent student) {
        if (repository.existsById(student.getId())) {
            throw VoteAlreadyDidException.EXCEPTION;
        }
        repository.save(voteStudentMapper.toCreate(student));
    }

    @Override
    public void update(VoteStudent student) {
        repository.save(voteStudentMapper.toUpdate(student));
    }

}
