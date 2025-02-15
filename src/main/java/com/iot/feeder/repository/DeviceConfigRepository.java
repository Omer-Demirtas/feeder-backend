package com.iot.feeder.repository;

import com.iot.feeder.entity.DeviceConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author Omer Demirtas
 */
@Repository
public interface DeviceConfigRepository extends JpaRepository<DeviceConfig, Long> {
    //@Query("SELECT d FROM DeviceConfig d WHERE d.id = :id")
    @Query("SELECT d FROM DeviceConfig d LEFT JOIN FETCH d.feedingSchedules WHERE d.id = :id")
    Optional<DeviceConfig> findByDeviceId(@Param("id") Long deviceId);

    @Query("SELECT d.lastUpdatedDate from DeviceConfig d where d.id = :id")
    Optional<LocalDateTime> findLastUpdatedDateById(@Param("id") Long deviceId);

    @Modifying
    @Query("UPDATE DeviceConfig SET lastUpdatedDate = :lastUpdatedDate WHERE id = :id")
    void updateLastUpdatedDateById(@Param("id") Long deviceId, @Param("lastUpdatedDate") LocalDateTime lastUpdatedDate);
}