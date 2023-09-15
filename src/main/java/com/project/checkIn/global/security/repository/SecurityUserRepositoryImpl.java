package com.project.checkIn.global.security.repository;

import com.project.checkIn.domain.user.presentation.dto.User;
import com.project.checkIn.global.security.auth.AuthDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;

@Repository
public class SecurityUserRepositoryImpl implements SecurityUserRepository {
    public User getCurrentUser() {
        AuthDetails auth = (AuthDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return auth.getUser();
    }
}
