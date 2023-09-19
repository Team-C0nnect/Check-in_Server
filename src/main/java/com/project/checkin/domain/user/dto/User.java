package com.project.checkin.domain.user.dto;


import com.project.checkin.domain.user.domain.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
