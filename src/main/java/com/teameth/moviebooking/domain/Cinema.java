package com.teameth.moviebooking.domain;

import jdk.jfr.DataAmount;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cinema")
public class Cinema {
@Id
    private int cinema_id;

    private String cinema_name;

    //private int location_id;
    private int number_of_halls;

    @ManyToOne(optional=false)
    @JoinColumn(name="location_id",referencedColumnName="id")
    private Location location;
    //private List<Halls> halls;

    @OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "cinemaHall_fk",referencedColumnName = "hall_id")
    public List<CinemaHall> cinemaHallList;
    public Cinema() {
    }

    public Cinema(int cinema_id, String cinema_name, int location_id, int number_of_halls) {
        this.cinema_id = cinema_id;
        this.cinema_name = cinema_name;
        //this.location_id = location_id;
        this.number_of_halls = number_of_halls;
        this.location = new Location();
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

    public List<CinemaHall> getCinemaHallList() {
        return cinemaHallList;
    }

    public void setCinemaHallList(List<CinemaHall> cinemaHallList) {
        this.cinemaHallList = cinemaHallList;
    }

   /* public int getlocation_id() {
        return location_id;
    }

    public void setlocation_id(int location_id) {
        this.location_id = location_id;
    }*/

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


}
