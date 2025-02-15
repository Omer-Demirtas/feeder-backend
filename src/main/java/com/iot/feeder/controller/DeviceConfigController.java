package com.iot.feeder.controller;

import com.iot.feeder.dto.DeviceConfigDTO;
import com.iot.feeder.dto.request.DeviceConfigSaveDTO;
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
    public DeviceConfigDTO getDeviceConfig(@RequestParam("id") Long id, @RequestParam(value = "lastUpdatedDate", required = false) LocalDateTime lastUpdatedDate) {
        return deviceConfigService.getDeviceConfig(id, lastUpdatedDate);
    }

    @PostMapping
    public DeviceConfigDTO saveDeviceConfig(@RequestBody DeviceConfigSaveDTO deviceConfigDTO) {
        return deviceConfigService.save(deviceConfigDTO);
    }
}
