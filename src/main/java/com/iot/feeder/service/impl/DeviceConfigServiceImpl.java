package com.iot.feeder.service.impl;

import com.iot.feeder.dto.DeviceConfigDTO;
import com.iot.feeder.mapper.DeviceConfigMapper;
import com.iot.feeder.repository.DeviceConfigRepository;
import com.iot.feeder.service.DeviceConfigService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author Omer Demirtas
 */
@Service
@RequiredArgsConstructor
public class DeviceConfigServiceImpl implements DeviceConfigService {
    private final DeviceConfigMapper deviceConfigMapper;
    private final DeviceConfigRepository deviceConfigRepository;

    @Override
    public DeviceConfigDTO getDeviceConfig(Long deviceId, LocalDateTime lastUpdatedTime) {
        // Device has same config, return null to notify there is nothing new
        if (lastUpdatedTime != null && deviceConfigRepository.findLastUpdatedDateById(deviceId).isEqual(lastUpdatedTime)) {
            return null;
        }

        return deviceConfigMapper.toDTO(
                deviceConfigRepository.findByDeviceId(deviceId)
                        .orElseThrow(() -> new EntityNotFoundException("DeviceConfig not found"))
        );
    }

    @Override
    public DeviceConfigDTO save(DeviceConfigDTO deviceConfigDTO) {
        return deviceConfigMapper.toDTO(
                deviceConfigRepository.save(
                        deviceConfigMapper.toEntity(deviceConfigDTO)
                )
        );
    }

    ;
}
