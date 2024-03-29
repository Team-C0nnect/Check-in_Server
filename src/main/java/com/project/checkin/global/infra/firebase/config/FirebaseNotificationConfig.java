package com.project.checkin.global.infra.firebase.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "firebase.notification")
public class FirebaseNotificationConfig {
    private String nonCheckTitle;
    private String nonCheckMessage;
}
