package com.iot.feeder.service.impl;

import com.iot.feeder.dto.FeedingScheduleDTO;
import com.iot.feeder.repository.FeedingScheduleRepository;
import com.iot.feeder.service.FeedingScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Omer Demirtas
 */
@Service
public class FeedingScheduleServiceImpl implements FeedingScheduleService {
    private final FeedingScheduleRepository feedingScheduleRepository;

    public FeedingScheduleServiceImpl(FeedingScheduleRepository feedingScheduleRepository) {
        this.feedingScheduleRepository = feedingScheduleRepository;
    }

    @Override
    public List<FeedingScheduleDTO> getFeedingSchedules() {
        return feedingScheduleRepository.findAllFeedingSchedule();
    }
}
