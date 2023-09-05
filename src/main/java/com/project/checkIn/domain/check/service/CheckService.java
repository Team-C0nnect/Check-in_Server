package com.project.checkIn.domain.check.service;

import com.project.checkIn.domain.check.domain.repository.CheckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class CheckService {
    CheckRepository repository;

}
