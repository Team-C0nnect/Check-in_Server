package com.project.checkin.global.infra.google.service;

import com.project.checkin.global.infra.google.dto.OAuth2Attribute;

public interface GoogleService {
    OAuth2Attribute getTokenInfo(String idToken);

}
