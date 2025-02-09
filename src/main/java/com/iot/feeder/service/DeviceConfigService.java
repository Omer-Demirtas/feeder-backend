package com.iot.feeder.service;

import com.iot.feeder.dto.DeviceConfigDTO;
import com.iot.feeder.dto.request.DeviceConfigSaveDTO;

import java.time.LocalDateTime;

/**
 * @author Omer Demirtas
 */
public interface DeviceConfigService {
    /**
     * Brings Device Config by given parameters
     * uses lastUpdatedTime to check there is anything new
     */
    DeviceConfigDTO getDeviceConfig(Long deviceId, LocalDateTime lastUpdatedTime);
    DeviceConfigDTO save(DeviceConfigSaveDTO deviceConfigSaveDTO);
}