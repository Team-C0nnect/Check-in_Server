package com.project.checkIn.domain.auth.presentation.request;

import com.project.checkIn.domain.user.domain.User;
import com.project.checkIn.domain.user.domain.enums.UserType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserSignUpRequest {

    private String id;
    private String password;
    private String name;
    private String email;

    public User toEntity(String encodedPassword) {
        return User.builder()
                .id(this.id)
                .password(encodedPassword)
                .name(this.name)
                .email(this.email)
                .type(UserType.ROLE_USER)
                .build();
    }
}
