package com.project.checkin.domain.user.presentation;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SecurityRequirement(name = "BearerAuthentication")
@Tag(name = "유저", description = "유저")
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @GetMapping("/{id}")
    public void getUser(@PathVariable long id) {
        log.info("........getUser");
    }
}
