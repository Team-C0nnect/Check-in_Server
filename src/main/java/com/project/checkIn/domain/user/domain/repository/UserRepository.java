package com.project.checkIn.domain.user.domain.repository;

import com.project.checkIn.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(String id);

    boolean existsById(String id);

}
