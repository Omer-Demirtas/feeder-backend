package com.iot.feeder.repository;

import com.iot.feeder.dto.FeedingScheduleDTO;
import com.iot.feeder.entity.FeedingSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Omer Demirtas
 */
@Repository
public interface FeedingScheduleRepository extends JpaRepository<FeedingSchedule, Long> {

    @Query(
            """
                SELECT new com.iot.feeder.dto.FeedingScheduleDTO(
                    f.id,
                    f.time
                ) from FeedingSchedule f
            """
    )
    List<FeedingScheduleDTO> findAllFeedingSchedule();
}
