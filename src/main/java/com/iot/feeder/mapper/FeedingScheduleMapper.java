package com.iot.feeder.mapper;

import com.iot.feeder.dto.FeedingScheduleDTO;
import com.iot.feeder.entity.FeedingSchedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Omer Demirtas
 */
@Mapper(componentModel = "spring")
public interface FeedingScheduleMapper {
    @Mapping(target = "deviceConfig", ignore = true)
    FeedingScheduleDTO map(FeedingSchedule feedingSchedule);
    FeedingSchedule map(FeedingScheduleDTO feedingScheduleDTO);
}
