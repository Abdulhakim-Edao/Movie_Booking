package com.teameth.moviebooking.repository;

import com.teameth.moviebooking.domain.Cinema;
import com.teameth.moviebooking.domain.MovieSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface MovieScheduleRepository extends JpaRepository<MovieSchedule,Integer> {
    public MovieSchedule findByDate(Date date);

}
