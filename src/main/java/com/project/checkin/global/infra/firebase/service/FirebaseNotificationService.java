package com.project.checkin.global.infra.firebase.service;

import com.project.checkin.global.infra.firebase.dto.FirebaseNotification;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface FirebaseNotificationService {

    void sendNonCheckNotification(List<String> tokens) throws ExecutionException, InterruptedException;

    void sendNotification(FirebaseNotification firebaseNotification) throws ExecutionException, InterruptedException;

    void saveToken(final String email, final String token);

    boolean hasKey(String email);

    String getToken(String email);
}
