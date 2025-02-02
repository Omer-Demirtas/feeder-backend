package com.iot.feeder.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

/**
 * @author Omer Demirtas
 */

@Getter
@Setter
public class FeedingScheduleDTO {
    private long id;
    private LocalTime time;

    public FeedingScheduleDTO(long id, LocalTime time) {
        this.id = id;
        this.time = time;
    }
}
