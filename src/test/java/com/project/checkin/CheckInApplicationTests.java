package com.project.checkin;

import com.project.checkin.domain.user.domain.enums.UserRole;
import com.project.checkin.domain.user.domain.repository.UserRepository;
import com.project.checkin.domain.user.mapper.UserMapper;
import com.project.checkin.global.common.jwt.JwtProvider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CheckInApplicationTests {

	@Autowired
	private JwtProvider jwtProvider;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserMapper userMapper;
	@Test
	void generateTokenTest() {
		String email = "vectorscope0807@dgsw.hs.kr";
//		User user = userRepository.findByEmail(email).map(userMapper::toUser).orElse(null);
//        System.out.println(jwtProvider.generateAccessToken(user.getEmail(), user.getUserRole()));
//        System.out.println(jwtProvider.generateRefreshToken(user.getEmail(), user.getUserRole()));
		System.out.println(jwtProvider.generateAccessToken("vectorscope0807@dgsw.hs.kr", UserRole.USER));
//        System.out.println(jwtProvider.generateRefreshToken("sewook0303@dgsw.hs.kr", UserRole.USER));
	}
}
