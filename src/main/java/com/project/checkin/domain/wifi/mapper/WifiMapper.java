package com.project.checkin.domain.wifi.mapper;

import com.project.checkin.domain.wifi.domain.WifiEntity;
import com.project.checkin.domain.wifi.dto.request.WifiRequest;
import org.springframework.stereotype.Component;

@Component
public class WifiMapper {

    public WifiEntity createEntity(WifiRequest wifiRequest) {
        return WifiEntity.builder()
                .ssid(wifiRequest.getSsid())
                .build();
    }

}
