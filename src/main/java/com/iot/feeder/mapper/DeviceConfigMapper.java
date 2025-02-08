package com.iot.feeder.mapper;

import com.iot.feeder.dto.DeviceConfigDTO;
import com.iot.feeder.entity.DeviceConfig;
import org.mapstruct.Mapper;

/**
 * @author Omer Demirtas
 */
@Mapper(componentModel = "spring")
public interface DeviceConfigMapper {
    DeviceConfigDTO toDTO(DeviceConfig deviceConfig);
    DeviceConfig toEntity(DeviceConfigDTO deviceConfigDTO);
}