package com.project.checkin.domain.user.mapper;

import com.project.checkin.domain.user.domain.UserEntity;
import com.project.checkin.domain.user.domain.enums.UserRole;
import com.project.checkin.domain.user.dto.User;
import com.project.checkin.global.infra.google.dto.OAuth2Attribute;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toUser(UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .email(userEntity.getEmail())
                .name(userEntity.getName())
                .userRole(userEntity.getUserRole())
                .build();
    }

    public UserEntity createEntity(OAuth2Attribute oAuth2Attribute) {
        return UserEntity.builder()
                .email(oAuth2Attribute.getEmail())
                .name(oAuth2Attribute.getName())
                .userRole(UserRole.USER)
                .build();
    }

}
