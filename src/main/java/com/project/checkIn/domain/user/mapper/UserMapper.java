package com.project.checkIn.domain.user.mapper;

import com.project.checkIn.domain.user.domain.UserEntity;
import com.project.checkIn.domain.user.domain.enums.UserRole;
import com.project.checkIn.domain.user.presentation.dto.User;
import com.project.checkIn.global.infra.google.dto.OAuth2Attribute;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toUser(UserEntity userEntity){
        return User.builder()
                .id(userEntity.getIdx())
                .email(userEntity.getEmail())
                .name(userEntity.getName())
                .userRole(userEntity.getType())
                .build();
    }

    public UserEntity createEntity(OAuth2Attribute oAuth2Attribute){
        return UserEntity.builder()
                .email(oAuth2Attribute.getEmail())
                .name(oAuth2Attribute.getName())
                .type(UserRole.USER)
                .build();
    }
}
