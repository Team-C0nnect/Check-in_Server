package com.project.checkin.domain.wifi.exception;

import com.project.checkin.domain.wifi.exception.error.WifiError;
import com.project.checkin.global.exception.BusinessException;

public class WifiAlreadyException extends BusinessException {

    public static final WifiAlreadyException EXCEPTION = new WifiAlreadyException();

    private WifiAlreadyException() {
        super(WifiError.WIFI_CONFLICT);
    }
}
