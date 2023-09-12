package com.project.checkIn.domain.user.presentation.dto.response;

import com.project.checkIn.domain.user.domain.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserResponse {

    private String email;
    private String name;

    public static UserResponse of(UserEntity user){
        return UserResponse.builder()
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }
}
