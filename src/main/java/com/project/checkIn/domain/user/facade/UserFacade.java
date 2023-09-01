package com.project.checkIn.domain.user.facade;

import com.project.checkIn.domain.user.domain.User;
import com.project.checkIn.domain.user.domain.repository.UserRepository;
import com.project.checkIn.domain.user.exception.UserAlreadyExistsException;
import com.project.checkIn.domain.user.exception.UserNotFoundException;
import com.project.checkIn.global.security.auth.AuthDetails;

import lombok.RequiredArgsConstructor;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class UserFacade {

    private final UserRepository userRepository;

    public User getCurrentUser() {
        AuthDetails auth = (AuthDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return findUserById(auth.getUser().getId());
    }

    @Transactional(readOnly = true)
    public void existsUserById(String id) {
        if(userRepository.existsById(id))
            throw UserAlreadyExistsException.EXCEPTION;
    }

    @Transactional(readOnly = true)
    public User findUserById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
    }

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

}
