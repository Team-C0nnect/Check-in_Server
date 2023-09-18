package com.project.checkin.global.common.repository;

import com.project.checkin.domain.user.dto.User;
import com.project.checkin.global.security.auth.principal.CustomUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;

@Repository
public class UserSecurityImpl implements UserSecurity {
    public User getUser() {
        return ((CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser();
    }

}
