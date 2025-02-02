package com.iot.feeder;

import com.iot.feeder.dto.FeedingScheduleDTO;
import com.iot.feeder.service.FeedingScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.List;

/**
 * @author Omer Demirtas
 */
@RestController()
@RequestMapping("/feeding-schedule")
public class FeedingScheduleController {
    private final FeedingScheduleService feedingScheduleService;

    public FeedingScheduleController(FeedingScheduleService feedingScheduleService) {
        this.feedingScheduleService = feedingScheduleService;
    }

    @GetMapping
    public List<FeedingScheduleDTO> getAllFeedingSchedule() {
        return feedingScheduleService.getFeedingSchedules();
    }

}
