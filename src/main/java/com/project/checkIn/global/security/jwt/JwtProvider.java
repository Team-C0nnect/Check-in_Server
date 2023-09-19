package com.project.checkIn.global.security.jwt;

import com.project.checkIn.domain.user.domain.enums.UserRole;
import com.project.checkIn.domain.user.domain.repository.UserRepository;
import com.project.checkIn.domain.user.exception.UserNotFoundException;
import com.project.checkIn.domain.user.mapper.UserMapper;
import com.project.checkIn.domain.user.presentation.dto.User;
import com.project.checkIn.global.security.auth.principal.CustomUserDetails;
import com.project.checkIn.global.security.jwt.config.JwtProperties;
import com.project.checkIn.global.security.jwt.enums.JwtType;
import com.project.checkIn.global.security.jwt.exception.TokenTypeException;
import io.jsonwebtoken.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class JwtProvider {
    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;
    private final UserMapper userMapper;
    private final JwtProperties jwtProperties;

    public Jws<Claims> getClaims(final String token){
        try{
            return Jwts.parser().setSigningKey(jwtProperties.getSecretKey()).parseClaimsJws(token);
        } catch (ExpiredJwtException e){
            throw new IllegalArgumentException("만료된 토큰");
        } catch (UnsupportedJwtException e){
            throw new IllegalArgumentException("지원되지 않는 토큰");
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("잘못된 토큰");
        }
    }

    public String generateAccessToken(final String email, final UserRole userRole){
        return Jwts.builder()
                .setHeaderParam(Header.JWT_TYPE, JwtType.ACCESS)
                .setSubject(email)
                .claim("authority", userRole)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + jwtProperties.getExpiration()))
                .signWith(SignatureAlgorithm.HS256, jwtProperties.getSecretKey())
                .compact();
    }

    public String generateRefreshToken(final String email, final UserRole userRole){
        return Jwts.builder()
                .setHeaderParam(Header.JWT_TYPE,JwtType.ACCESS)
                .setSubject(email)
                .claim("authority", userRole)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + jwtProperties.getRefreshExpiration()))
                .signWith(SignatureAlgorithm.HS256, jwtProperties.getSecretKey())
                .compact();
    }

    public Authentication getAuthentication(final String token){
        final Jws<Claims> claims = getClaims(token);

        if(isWrongType(claims,JwtType.ACCESS)){
            throw TokenTypeException.EXCEPTION;
        }
        User user = userRepository.findByEmail(claims.getBody().getSubject()).map(userMapper::toUser).orElseThrow(() -> UserNotFoundException.EXCEPTION);

        final CustomUserDetails details = new CustomUserDetails(user);

        return new UsernamePasswordAuthenticationToken(details, null, details.getAuthorities());
    }

    public String extractTokenFromRequest(HttpServletRequest request){
        return extractToken(request.getHeader(HttpHeaders.AUTHORIZATION));
    }

    public String extractToken(final String token){
        if(StringUtils.hasText(token) && token.startsWith("Bearer ")) {
            return token.substring(7);
        }
        return token;
    }

    public boolean isWrongType(final Jws<Claims> claims, final JwtType type){
        return !(claims.getHeader().get(Header.JWT_TYPE).equals(type.toString()));
    }

}
