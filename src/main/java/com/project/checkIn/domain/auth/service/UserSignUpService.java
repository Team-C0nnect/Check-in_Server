package com.project.checkIn.domain.auth.service;

import com.project.checkIn.domain.auth.presentation.request.UserSignUpRequest;
import com.project.checkIn.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserSignUpService {

    private final UserFacade userFacade;
    private final PasswordEncoder encoder;

    @Transactional
    public void execute(UserSignUpRequest request) {
        userFacade.existsUserById(request.getId());
        userFacade.save(request.toEntity(encoder.encode(request.getPassword())));
    }

}
