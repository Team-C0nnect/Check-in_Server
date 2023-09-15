package com.project.checkIn.global.security.repository;

import com.project.checkIn.domain.user.presentation.dto.User;

public interface SecurityUserRepository {
    User getCurrentUser();

}
