package com.project.checkin.domain.wifi.Service;

import com.project.checkin.domain.wifi.dto.request.WifiRequest;

public interface WifiService {

    void wifiRegister(WifiRequest wifiRequest);

    boolean wifiCheck(WifiRequest wifiRequest);
}