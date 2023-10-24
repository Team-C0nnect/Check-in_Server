package com.project.checkin.global.common.jwt;

import com.project.checkin.domain.user.domain.enums.UserRole;
import com.project.checkin.domain.user.domain.repository.UserRepository;
import com.project.checkin.domain.user.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JwtProviderTests {

    @Autowired
    private JwtProvider jwtProvider;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    @Test
    void generateTokenTest() {
//        String email = "vectorscope0807@dgsw.hs.kr";
//        User user = userRepository.findByEmail(email).map(userMapper::toUser).orElse(null);
//        System.out.println(jwtProvider.generateAccessToken(user.getEmail(), user.getUserRole()));
//        System.out.println(jwtProvider.generateRefreshToken(user.getEmail(), user.getUserRole()));
        System.out.println(jwtProvider.generateAccessToken("vectorscope0807@dgsw.hs.kr", UserRole.USER));
        System.out.println(jwtProvider.generateRefreshToken("vectorscope0807@dgsw.hs.kr", UserRole.USER));
    }

}