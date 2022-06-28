package com.teameth.moviebooking.service;

import com.teameth.moviebooking.domain.Cinema;
import com.teameth.moviebooking.domain.Movie;
import com.teameth.moviebooking.domain.MovieSchedule;
import com.teameth.moviebooking.repository.MovieScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
@Service
public class MovieScheduleService {
    @Autowired
    private MovieScheduleRepository movieScheduleRepository;

    public List<MovieSchedule> getAllMovieSchedule(){
        return movieScheduleRepository.findAll();
    }

    public void saveSchedule(MovieSchedule schedule){
        movieScheduleRepository.save(schedule);
    }

    public MovieSchedule getMovieSchedule(Integer scheduleId){
        return movieScheduleRepository.findById(scheduleId).get();
    }

    public MovieSchedule getMovieSchedulebyDate(Date scheduleDate) {
        return movieScheduleRepository.findByDate(scheduleDate);
    }

    public void saveMovieSchedule(MovieSchedule movieSchedule) {

        movieScheduleRepository.save(movieSchedule);
    }
}
