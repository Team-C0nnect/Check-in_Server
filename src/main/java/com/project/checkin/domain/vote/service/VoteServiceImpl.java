package com.project.checkin.domain.vote.service;

import com.project.checkin.domain.vote.domain.repository.VoteRepository;
import com.project.checkin.domain.vote.dto.Vote;
import com.project.checkin.domain.vote.exception.VoteAlreadyDidException;
import com.project.checkin.domain.vote.mapper.VoteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VoteServiceImpl implements VoteService{

    private final VoteRepository repository;
    private final VoteMapper voteMapper;

    @Override
    public void register(Vote vote) {
        if(repository.findById(vote.getId()).isPresent()){
            throw VoteAlreadyDidException.EXCEPTION;
        }
        repository.save(voteMapper.toCreate(vote));
    }



}
