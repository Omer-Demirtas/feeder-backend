package com.iot.feeder.mapper;

import com.iot.feeder.dto.FeedingScheduleDTO;
import com.iot.feeder.entity.FeedingSchedule;
import org.mapstruct.Mapper;

/**
 * @author Omer Demirtas
 */
@Mapper(componentModel = "spring")
public interface FeedingScheduleMapper {
    FeedingScheduleDTO map(FeedingSchedule feedingSchedule);
    FeedingSchedule map(FeedingScheduleDTO feedingScheduleDTO);
}
