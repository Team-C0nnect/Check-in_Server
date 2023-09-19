package com.project.checkIn.domain.auth.service;


import com.project.checkIn.domain.auth.presentation.dto.request.AuthenticationRequest;
import com.project.checkIn.domain.auth.presentation.dto.response.JsonWebTokenResponse;
import com.project.checkIn.domain.user.domain.UserEntity;
import com.project.checkIn.domain.user.domain.enums.UserRole;
import com.project.checkIn.domain.user.domain.repository.UserRepository;
import com.project.checkIn.domain.user.exception.UserNotFoundException;
import com.project.checkIn.domain.user.mapper.UserMapper;
import com.project.checkIn.domain.user.presentation.dto.User;
import com.project.checkIn.global.infra.google.dto.OAuth2Attribute;
import com.project.checkIn.global.infra.google.service.GoogleService;
import com.project.checkIn.global.security.jwt.JwtProvider;
import com.project.checkIn.global.security.jwt.enums.JwtType;
import com.project.checkIn.global.security.jwt.exception.TokenTypeException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.lang.Strings;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class OAuth2UserServiceImpl implements OAuth2UserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final GoogleService googleService;
    private final JwtProvider jwtProvider;

    public JsonWebTokenResponse auth(AuthenticationRequest request) {
        OAuth2Attribute oAuth2Attribute = googleService.getTokenInfo(request.getIdToken());
        if(!Strings.hasText(oAuth2Attribute.getEmail())){
            throw UserNotFoundException.EXCEPTION;
        }
        User user = findOrSave(oAuth2Attribute);

        return JsonWebTokenResponse.builder()
                .accessToken(jwtProvider.generateAccessToken(user.getEmail(),user.getUserRole()))
                .refreshToken(jwtProvider.generateRefreshToken(user.getEmail(),user.getUserRole()))
                .build();
    }

    @Override
    public JsonWebTokenResponse refresh(String token){
        Jws<Claims> claims = jwtProvider.getClaims(jwtProvider.extractToken(token));
        if(jwtProvider.isWrongType(claims, JwtType.REFRESH)){
            throw TokenTypeException.EXCEPTION;
        }
        return JsonWebTokenResponse.builder()
                .accessToken(jwtProvider.generateAccessToken(claims.getBody().getSubject(), (UserRole) claims.getHeader().get("authority")))
                .build();
    }

    private User findOrSave(OAuth2Attribute oAuth2Attribute){
        User user = userRepository.findByEmail(oAuth2Attribute.getEmail()).map(userMapper::toUser).orElse(null);
        if(user == null){
            return save(userMapper.createEntity(oAuth2Attribute));
        }
        return user;
    }

    private User save(final UserEntity userEntity){
        return userMapper.toUser(userRepository.save(userEntity));

    }

}
