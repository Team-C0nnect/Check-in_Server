package com.project.checkIn.domain.user.service;

import com.project.checkIn.domain.user.facade.UserFacade;
import com.project.checkIn.domain.user.presentation.dto.User;
import com.project.checkIn.domain.user.presentation.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FindUserInfoService {

    private final UserFacade userFacade;

    @Transactional
    public UserResponse execute(){
        User user = userFacade.getCurrentUser();

        return UserResponse.of(user);
    }
}
