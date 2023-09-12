package com.project.checkIn.domain.user.domain.repository;

import com.project.checkIn.domain.user.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(String email);

//    Optional<UserEntity> findById(String id);

//    boolean existsById(String id);

}
