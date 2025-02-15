package com.iot.feeder.service.impl;

import com.iot.feeder.dto.FeedingScheduleDTO;
import com.iot.feeder.entity.FeedingSchedule;
import com.iot.feeder.mapper.FeedingScheduleMapper;
import com.iot.feeder.repository.DeviceConfigRepository;
import com.iot.feeder.repository.FeedingScheduleRepository;
import com.iot.feeder.service.FeedingScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Omer Demirtas
 */
@Service
@RequiredArgsConstructor
public class FeedingScheduleServiceImpl implements FeedingScheduleService {
    private final FeedingScheduleMapper feedingScheduleMapper;
    private final DeviceConfigRepository deviceConfigRepository;
    private final FeedingScheduleRepository feedingScheduleRepository;

    @Override
    public List<FeedingScheduleDTO> getFeedingSchedules() {
        return feedingScheduleRepository.findAllFeedingSchedule();
    }

    @Override
    @Transactional
    public Long save(FeedingScheduleDTO feedingScheduleDTO) {
        deviceConfigRepository.updateLastUpdatedDateById(feedingScheduleDTO.getDeviceConfig().getId(), LocalDateTime.now());

        return feedingScheduleRepository.save(
                feedingScheduleMapper.map(feedingScheduleDTO)
        ).getId();
    }
}
