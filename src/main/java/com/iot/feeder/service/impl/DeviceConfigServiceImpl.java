package com.iot.feeder.service.impl;

import com.iot.feeder.dto.DeviceConfigDTO;
import com.iot.feeder.dto.request.DeviceConfigSaveDTO;
import com.iot.feeder.entity.DeviceConfig;
import com.iot.feeder.mapper.DeviceConfigMapper;
import com.iot.feeder.repository.DeviceConfigRepository;
import com.iot.feeder.service.DeviceConfigService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author Omer Demirtas
 */
@Log4j2
@Service
@RequiredArgsConstructor
public class DeviceConfigServiceImpl implements DeviceConfigService {
    private final DeviceConfigMapper deviceConfigMapper;
    private final DeviceConfigRepository deviceConfigRepository;

    @Override
    public DeviceConfigDTO getDeviceConfig(Long deviceId, LocalDateTime lastUpdatedDate) {
        log.debug("DeviceID {} lastUpdatedTime {}", deviceId, lastUpdatedDate);
        // Device has same config, return null to notify there is nothing new
        if (
                lastUpdatedDate != null &&
                deviceConfigRepository.findLastUpdatedDateById(deviceId)
                        .orElseThrow(() -> new EntityNotFoundException(String.format("DeviceConfig with id %s", deviceId)))
                        .isEqual(lastUpdatedDate)
        ) {
            return null;
        }

        return deviceConfigMapper.toDTO(
                deviceConfigRepository.findByDeviceId(deviceId)
                        .orElseThrow(() -> new EntityNotFoundException("DeviceConfig not found"))
        );
    }

    @Override
    public DeviceConfigDTO save(DeviceConfigSaveDTO deviceConfigSaveDTO) {
        return deviceConfigMapper.toDTO(
                deviceConfigRepository.save(
                        deviceConfigMapper.toEntity(deviceConfigSaveDTO)
                )
        );
    }

    ;
}
