package com.cinematic.service;

import java.time.LocalDate;
import java.util.List;

import com.cinematic.model.Screening;
import com.cinematic.model.Seat;

public interface ScreeningService {
    List<Screening> getAllScreenings();

    Screening getScreeningById(Long screening_id);

    Screening pushScreening(Screening newScreening);

    Screening updateScreening(Screening updatedScreening, Long screening_id);

    List<Seat> getSeatsByScreeningId(Long screening_id);

    List<Screening> getAllScreenings(LocalDate startDate, LocalDate endDate);
}
