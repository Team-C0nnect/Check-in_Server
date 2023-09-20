package com.project.checkIn.domain.user.presentation.dto;

import com.project.checkIn.domain.user.domain.enums.UserRole;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private Long id;
    private String email;
    private String name;
    private UserRole userRole;
}

