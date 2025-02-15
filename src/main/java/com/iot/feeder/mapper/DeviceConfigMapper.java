package com.iot.feeder.mapper;

import com.iot.feeder.dto.DeviceConfigDTO;
import com.iot.feeder.dto.request.DeviceConfigSaveDTO;
import com.iot.feeder.entity.DeviceConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Omer Demirtas
 */
@Mapper(componentModel = "spring", uses = {FeedingScheduleMapper.class})
public interface DeviceConfigMapper {
    @Mapping(target = "feedingSchedules.deviceConfig", ignore = true) // Avoid circular reference
    DeviceConfigDTO toDTO(DeviceConfig deviceConfig);
    DeviceConfig toEntity(DeviceConfigDTO deviceConfigDTO);
    DeviceConfig toEntity(DeviceConfigSaveDTO deviceConfigSaveDTO);
}