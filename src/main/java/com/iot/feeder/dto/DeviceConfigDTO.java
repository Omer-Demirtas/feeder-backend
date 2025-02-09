package com.iot.feeder.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

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

    private List<FeedingScheduleDTO> feedingSchedules;

    private LocalDateTime createdDate;

    private LocalDateTime lastUpdatedDate;
}
