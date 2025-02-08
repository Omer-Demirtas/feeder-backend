package com.iot.feeder.controller;

import com.iot.feeder.dto.DeviceConfigDTO;
import com.iot.feeder.service.DeviceConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * @author Omer Demirtas
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/device-config")
public class DeviceConfigController {
    private final DeviceConfigService deviceConfigService;

    @GetMapping
    public DeviceConfigDTO getDeviceConfig(@RequestParam("id") Long id, @RequestParam(value = "lastUpdatedTime", required = false) LocalDateTime lastUpdatedTime) {
        return deviceConfigService.getDeviceConfig(id, lastUpdatedTime);
    }

    @PostMapping
    public DeviceConfigDTO saveDeviceConfig(@RequestBody DeviceConfigDTO deviceConfigDTO) {
        return deviceConfigService.save(deviceConfigDTO);
    }
}
