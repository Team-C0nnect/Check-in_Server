package com.project.checkIn.domain.user.service;

import com.project.checkIn.domain.user.domain.repository.UserRepository;
import com.project.checkIn.domain.user.exception.UserNotFoundException;
import com.project.checkIn.domain.user.presentation.dto.User;
import com.project.checkIn.global.security.repository.SecurityUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    private final SecurityUserRepository securityUserRepository;
    private final UserRepository userRepository;

    public User findUserByEmail(String email) {
        User user = securityUserRepository.getCurrentUser();
        return userRepository.findByEmail(email)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
    }

    public void save(User user) {
        userRepository.save(user);
    }

}
