package com.project.checkIn.global.common.repository;

import com.project.checkIn.domain.user.presentation.dto.User;
import com.project.checkIn.global.security.auth.principal.CustomUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class UserSecurityImpl implements UserSecurity {
    public User getUser() {
        return ((CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser();
    }

}
