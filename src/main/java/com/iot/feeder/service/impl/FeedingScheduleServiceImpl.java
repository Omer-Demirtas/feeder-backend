package com.iot.feeder.service.impl;

import com.iot.feeder.dto.FeedingScheduleDTO;
import com.iot.feeder.mapper.FeedingScheduleMapper;
import com.iot.feeder.repository.FeedingScheduleRepository;
import com.iot.feeder.service.FeedingScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Omer Demirtas
 */
@Service
@RequiredArgsConstructor
public class FeedingScheduleServiceImpl implements FeedingScheduleService {
    private final FeedingScheduleMapper feedingScheduleMapper;
    private final FeedingScheduleRepository feedingScheduleRepository;

    @Override
    public List<FeedingScheduleDTO> getFeedingSchedules() {
        return feedingScheduleRepository.findAllFeedingSchedule();
    }

    @Override
    public Long save(FeedingScheduleDTO feedingScheduleDTO) {
        return feedingScheduleRepository.save(
                feedingScheduleMapper.map(feedingScheduleDTO)
        ).getId();
    }
}
