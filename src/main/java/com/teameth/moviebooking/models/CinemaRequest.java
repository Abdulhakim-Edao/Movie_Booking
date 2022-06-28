package com.teameth.moviebooking.models;

import com.teameth.moviebooking.domain.CinemaHall;
import com.teameth.moviebooking.domain.Location;
import com.teameth.moviebooking.service.CinemaHallService;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class CinemaRequest {

    private int cinema_id;
    private String cinema_name;


    private int number_of_halls;

    private Location location;
    private CinemaHall cinemaHall;

    public CinemaRequest() {
    }

    public List<CinemaHall> cinemaHallList;
    public CinemaRequest(int cinema_id, String cinema_name, int number_of_halls, Location location, List<CinemaHall> cinemaHallList) {
        this.cinema_id = cinema_id;
        this.cinema_name = cinema_name;
        this.number_of_halls = number_of_halls;
        this.location = location;
        this.cinemaHallList = cinemaHallList;
    }

    public int getCinema_id() {
        return cinema_id;
    }

    public void setCinema_id(int cinema_id) {
        this.cinema_id = cinema_id;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public void setCinema_name(String cinema_name) {
        this.cinema_name = cinema_name;
    }

    public int getNumber_of_halls() {
        return number_of_halls;
    }

    public void setNumber_of_halls(int number_of_halls) {
        this.number_of_halls = number_of_halls;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<CinemaHall> getCinemaHallList() {
        return cinemaHallList;
    }

    public void setCinemaHallList(List<CinemaHall> cinemaHallList) {
        this.cinemaHallList = cinemaHallList;
    }
}
