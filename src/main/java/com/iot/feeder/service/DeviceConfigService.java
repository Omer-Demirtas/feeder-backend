package com.iot.feeder.service;

import com.iot.feeder.dto.DeviceConfigDTO;

import java.time.LocalDateTime;

/**
 * @author Omer Demirtas
 */
public interface DeviceConfigService {
    DeviceConfigDTO getDeviceConfig(Long deviceId, LocalDateTime lastUpdatedTime);
    DeviceConfigDTO save(DeviceConfigDTO deviceConfigDTO);
}