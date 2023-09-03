package com.project.checkIn.domain.auth.service;

import com.project.checkIn.domain.auth.presentation.request.SignInRequest;
import com.project.checkIn.domain.auth.presentation.responce.UserTokenResponse;
import com.project.checkIn.domain.user.domain.User;
import com.project.checkIn.domain.user.exception.PasswordWrongException;
import com.project.checkIn.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserSignInService {

    private final UserFacade userFacade;
    private final PasswordEncoder encoder;
//    private final JwtProvider jwtProvider;

    @Transactional
    public UserTokenResponse execute(SignInRequest request) {
        User user = userFacade.findUserById(request.getId());

        if (!encoder.matches(request.getPassword(), user.getPassword()))
            throw PasswordWrongException.EXCEPTION;

        return UserTokenResponse.builder()
//                .accessToken(jwtProvider.generateAccessToken(user.getId()))
//                .refreshToken(jwtProvider.generateRefreshToken(user.getId()))
                .name(user.getName())
                .build();
    }

}
