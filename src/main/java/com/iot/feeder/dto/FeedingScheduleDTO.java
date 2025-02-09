package com.iot.feeder.dto;

import com.iot.feeder.entity.DeviceConfig;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * @author Omer Demirtas
 */

@Getter
@Setter
@NoArgsConstructor
public class FeedingScheduleDTO implements Serializable {
    private long id;
    private LocalTime time;

    private DeviceConfig deviceConfig;

    public FeedingScheduleDTO(long id, LocalTime time) {
        this.id = id;
        this.time = time;
    }
}
