package com.project.checkin.domain.wifi.Service;

import com.project.checkin.domain.wifi.domain.repository.WifiRepository;
import com.project.checkin.domain.wifi.dto.request.WifiRequest;
import com.project.checkin.domain.wifi.exception.WifiAlreadyException;
import com.project.checkin.domain.wifi.exception.WifiNotFoundException;
import com.project.checkin.domain.wifi.mapper.WifiMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WifiServiceImpl implements WifiService{

    private final WifiRepository wifiRepository;
    private final WifiMapper wifiMapper;

    @Override
    public void wifiRegister(WifiRequest wifiRequest) {

        if(wifiRepository.findBySsid(wifiRequest.getSsid()).isPresent()){
            throw WifiAlreadyException.EXCEPTION;
        }
        wifiRepository.save(wifiMapper.createEntity(wifiRequest));

    }

    @Override
    public ResponseEntity<Void> wifiCheck(WifiRequest wifiRequest){

        if(wifiRepository.findBySsid(wifiRequest.getSsid()).isEmpty()){
            throw WifiNotFoundException.EXCEPTION;
        }
        return ResponseEntity.ok().build();

    }

}
