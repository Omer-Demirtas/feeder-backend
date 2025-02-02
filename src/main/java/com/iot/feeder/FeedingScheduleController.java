package com.iot.feeder;

import com.iot.feeder.dto.FeedingScheduleDTO;
import com.iot.feeder.service.FeedingScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;

/**
 * @author Omer Demirtas
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/feeding-schedule")
public class FeedingScheduleController {
    private final FeedingScheduleService feedingScheduleService;

    @GetMapping
    public List<FeedingScheduleDTO> getAllFeedingSchedule() {
        return feedingScheduleService.getFeedingSchedules();
    }


    @PostMapping
    public Long save(@RequestBody FeedingScheduleDTO feedingScheduleDTO) {
        return feedingScheduleService.save(feedingScheduleDTO);
    }
}
