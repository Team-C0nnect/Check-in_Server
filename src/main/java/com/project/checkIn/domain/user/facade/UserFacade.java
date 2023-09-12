package com.project.checkIn.domain.user.facade;

import com.project.checkIn.domain.user.domain.UserEntity;
import com.project.checkIn.domain.user.domain.repository.UserRepository;
import com.project.checkIn.domain.user.exception.UserAlreadyExistsException;

import lombok.RequiredArgsConstructor;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class UserFacade {

//    private final UserRepository userRepository;
//
//    public UserEntity getCurrentUser() {
//        AuthDetails auth = (AuthDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        return findUserById(auth.getUser().getId());
//    }
//
//    @Transactional(readOnly = true)
//    public void existsUserById(String id) {
//        if(userRepository.existsById(id))
//            throw UserAlreadyExistsException.EXCEPTION;
//    }
//
//    @Transactional(readOnly = true)
//    public UserEntity findUserById(String id) {
//        return userRepository.findById(id)
//                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
//    }
//
//    @Transactional
//    public void save(UserEntity user) {
//        userRepository.save(user);
//    }

}
