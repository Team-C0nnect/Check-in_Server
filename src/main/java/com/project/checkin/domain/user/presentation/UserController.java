package com.project.checkin.domain.user.presentation;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "", description = "")
@SecurityRequirement(name = "BearerAuthentication")

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @GetMapping("/{id}")
    public void getUser(@PathVariable long id) {
        log.info("........getUser");
    }
}
