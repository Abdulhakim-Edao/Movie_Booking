package com.teameth.moviebooking.domain;

import com.teameth.moviebooking.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "movieschedule")
public class MovieSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int  movie_schedule_id;
    private Time start_time;
    private Time end_time;
    private Date date;

    public MovieSchedule() {
    }

    // private int movieId;
    @ManyToOne(optional=false)
    @JoinColumn(name="movie_id",referencedColumnName="movieId")
    private  Movie movie;

    public MovieSchedule(int movie_schedule_id, Time start_time, Time end_time, Date date) {
        this.movie_schedule_id = movie_schedule_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.date = date;
        this.movie = new Movie();
    }

    public int getMovie_schedule_id() {
        return movie_schedule_id;
    }

    public void setMovie_schedule_id(int movie_schedule_id) {
        this.movie_schedule_id = movie_schedule_id;
    }

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }

    public Date getDate() {
        return date;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
