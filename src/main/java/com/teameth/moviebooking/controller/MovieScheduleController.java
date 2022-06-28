package com.teameth.moviebooking.controller;


import com.teameth.moviebooking.domain.Movie;
import com.teameth.moviebooking.domain.MovieSchedule;
import com.teameth.moviebooking.models.MovieRequest;
import com.teameth.moviebooking.service.MovieScheduleService;
import com.teameth.moviebooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

@RestController
public class MovieScheduleController {
    @Autowired
    private MovieScheduleService movieScheduleService;
    @Autowired
    private MovieService movieService;

    @RequestMapping("/movieSchedule")
    public List<MovieSchedule> getAllMovieSchedules(){
        return movieScheduleService.getAllMovieSchedule();
    }

    @RequestMapping("/movieSchedule/{moviescheduleId}")
    public MovieSchedule getmovieById(@PathVariable Integer movieScheduleId){
        return movieScheduleService.getMovieSchedule(movieScheduleId);
    }
    @RequestMapping("/movieSchedule/{scheduleDate}")
    public MovieSchedule getMovieByName(Date scheduleDate){
        return movieScheduleService.getMovieSchedulebyDate(scheduleDate);
    }

   /* @RequestMapping(method = RequestMethod.POST ,value="/movie/{movieId}/movieSchedule")
    public void saveNewMovieSchedule(@RequestBody MovieSchedule movieSchedule,@PathVariable Integer movieId){
        Movie movie = movieService.getMovie(movieId);
        movieSchedule.setMovie(movie);
        movieScheduleService.saveMovieSchedule(movieSchedule);
    }*/
   @RequestMapping(method = RequestMethod.POST ,value="/movie/{movieId}/movieSchedule")
   public void saveNewMovieSchedule(@RequestBody MovieRequest movieRequest, @PathVariable Integer movieId) throws ParseException {

       Movie movie = movieService.getMovie(movieId);
       MovieSchedule movieSchedule = new MovieSchedule(movieRequest.getMovie_schedule_id(),
               movieRequest.getStart_time(),
               movieRequest.getEnd_time(),
               movieRequest.getDate());


       movieSchedule.setMovie(movie);
       movieScheduleService.saveMovieSchedule(movieSchedule);

   }




}
