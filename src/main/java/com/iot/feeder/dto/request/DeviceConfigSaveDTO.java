package com.iot.feeder.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Omer Demirtas
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeviceConfigSaveDTO {
    private String deviceName;
}
