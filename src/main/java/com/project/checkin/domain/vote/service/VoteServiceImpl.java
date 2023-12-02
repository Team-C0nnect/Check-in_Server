package com.project.checkin.domain.vote.service;

import com.project.checkin.domain.vote.domain.repository.VoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VoteServiceImpl implements VoteService{

    private final VoteRepository repository;

    @Override
    public void register(Long movieId) {
        if(repository.findById(movieId).isPresent()){

        }
    }
}
