package com.project.checkin.global.config;


import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.user.domain.enums.UserRole;
import com.project.checkin.global.common.jwt.filter.JwtAuthenticationFilter;

import com.project.checkin.global.common.jwt.filter.JwtExceptionFilter;
import com.project.checkin.global.common.jwt.handler.JwtAuthenticationEntryPoint;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    private final JwtExceptionFilter jwtExceptionFilter;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .exceptionHandling(handlingConfigures -> handlingConfigures.authenticationEntryPoint(jwtAuthenticationEntryPoint))
                .authorizeHttpRequests(
                        authorize -> authorize
                                    .requestMatchers("/swagger-ui/**", "/v3/**").permitAll()
                                    .requestMatchers("/auth/**").permitAll()
//                                    .requestMatchers(String.valueOf(UserRole.USER)).permitAll()
//                                    .requestMatchers("/").permitAll()
                                    .anyRequest()
                                    .authenticated()
                )
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(jwtExceptionFilter, JwtAuthenticationFilter.class);


        return http.build();
    }


}
