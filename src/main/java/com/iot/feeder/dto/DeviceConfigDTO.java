package com.iot.feeder.dto;

import com.iot.feeder.entity.FeedingSchedule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Omer Demirtas
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeviceConfigDTO implements Serializable {
    private Long id;

    private String deviceName;

    private LocalDateTime lastUpdatedDate;

    private List<FeedingSchedule> feedingSchedules;
}
