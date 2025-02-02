package com.iot.feeder.service;

import com.iot.feeder.dto.FeedingScheduleDTO;

import java.util.List;

/**
 * @author Omer Demirtas
 */
public interface FeedingScheduleService {
    List<FeedingScheduleDTO> getFeedingSchedules();
}
