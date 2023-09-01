package com.project.checkIn.domain.auth.domain.repository;

import com.project.checkIn.domain.auth.domain.RefreshToken;
import org.springframework.data.repository.CrudRepository;

public interface RefreshTokenRepository extends CrudRepository<RefreshToken, String> {

}
