package com.project.checkin.domain.wifi.Service;

import com.project.checkin.domain.wifi.dto.request.WifiRequest;
import org.springframework.http.ResponseEntity;


public interface WifiService {

    void wifiRegister(WifiRequest wifiRequest);

    ResponseEntity<Void> wifiCheck(WifiRequest wifiRequest);


}
