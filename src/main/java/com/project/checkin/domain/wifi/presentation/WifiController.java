package com.project.checkin.domain.wifi.presentation;

import com.project.checkin.domain.wifi.Service.WifiService;
import com.project.checkin.domain.wifi.dto.request.WifiRequest;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/wifi")
public class WifiController {

    private final WifiService wifiService;

    @Operation(summary = "와이파이 등록", description = "와이파이를 등록합니다")
    @PostMapping("")
    public void wifiRegister(WifiRequest wifiRequest){
        wifiService.wifiRegister(wifiRequest);
    }

    @Operation(summary = "와이파이 확인", description = "와이파이를 확인합니다")
    @GetMapping("")
    public ResponseEntity<Void> wifiCheck(WifiRequest wifiRequest){
        return wifiService.wifiCheck(wifiRequest);
    }

}
