package com.iot.feeder.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Omer Demirtas
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DEVICE_CONFIG")
public class DeviceConfig implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deviceName;

    @OneToMany(mappedBy = "deviceConfig", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FeedingSchedule> feedingSchedules;

    private LocalDateTime lastUpdatedDate = LocalDateTime.now();
}
