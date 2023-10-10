package com.project.checkin.global.infra.firebase.service;

import com.project.checkin.global.infra.firebase.dto.FirebaseNotification;

import java.util.concurrent.ExecutionException;

public interface FirebaseNotificationService {
    void sendNotification(FirebaseNotification firebaseNotification) throws ExecutionException, InterruptedException;
    void saveToken(final String email, final String token);
}
