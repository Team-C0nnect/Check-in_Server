package com.project.checkIn.domain.user.domain;

import com.project.checkIn.domain.user.domain.enums.UserRole;
import com.project.checkIn.global.entity.BaseTime;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter @NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_user")
public class UserEntity extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(unique = true)
    private String id;

    @Column
    private String name;

    @Column(unique = true)
    private String password;

    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole type;

    @Builder
    public UserEntity(String id, String password, String name, String email, UserRole type) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.type = type;
    }
}
