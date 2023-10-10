package com.project.checkin.global.infra.firebase.service;

import com.google.firebase.messaging.*;
import com.project.checkin.global.infra.firebase.domain.repository.FirebaseTokenRepository;
import com.project.checkin.global.infra.firebase.dto.FirebaseNotification;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;


@Service
@RequiredArgsConstructor
public class FirebaseNotificationServiceImpl implements FirebaseNotificationService {

    private final FirebaseTokenRepository firebaseTokenRepository;


    @Async
    public void sendNotification(FirebaseNotification firebaseNotification) throws ExecutionException, InterruptedException {
        List<String> registrationTokens = new ArrayList<>();

        firebaseNotification.getEmails().forEach(email -> {
            if (hasKey(email)) {
                registrationTokens.add(getToken(email));
            }
        });
        if (registrationTokens.size() > 0)
            send(createMessage(registrationTokens, createNotification(firebaseNotification), createApnsConfig()));
    }

    private void send(MulticastMessage message) throws ExecutionException, InterruptedException {
        FirebaseMessaging.getInstance().sendEachForMulticastAsync(message).get();
    }

    private void send(Message message) throws ExecutionException, InterruptedException {
        FirebaseMessaging.getInstance().sendAsync(message).get();
    }

    private MulticastMessage createMessage(List<String> registrationTokens, com.google.firebase.messaging.Notification notification, ApnsConfig apnsConfig) {

        return MulticastMessage.builder()
                .setNotification(notification)
                .setApnsConfig(apnsConfig)
                .addAllTokens(registrationTokens)
                .build();
    }

    private ApnsConfig createApnsConfig() {
        return ApnsConfig.builder().setAps(Aps.builder().setSound("default").build()).build();
    }

    private com.google.firebase.messaging.Notification createNotification(FirebaseNotification firebaseNotification) {
        return com.google.firebase.messaging.Notification.builder()
                .setTitle(firebaseNotification.getTitle())
                .setBody(firebaseNotification.getMessage()).build();
    }

    public void saveToken(final String email, final String token) {
        if (StringUtils.hasText(token))
            firebaseTokenRepository.saveToken(email, token);
    }

    public void deleteToken(String email) {
        firebaseTokenRepository.deleteToken(email);
    }

    private boolean hasKey(String email) {
        return firebaseTokenRepository.hasKey(email);
    }

    private String getToken(String email) {
        return firebaseTokenRepository.getToken(email);
    }
}
