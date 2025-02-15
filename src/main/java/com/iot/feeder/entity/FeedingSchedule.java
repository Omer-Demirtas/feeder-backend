package com.iot.feeder.entity;

import jakarta.persistence.*;
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
@Entity
@Table(name = "FEEDING_SCHEDULE")
@NoArgsConstructor
@AllArgsConstructor
public class FeedingSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "device_config_id", nullable = false)
    private DeviceConfig deviceConfig;
}
