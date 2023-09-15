package com.project.checkIn.domain.user.presentation.dto;

import com.project.checkIn.domain.user.domain.enums.UserType;
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
    private UserType userType;

}
