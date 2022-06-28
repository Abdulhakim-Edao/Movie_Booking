package com.teameth.moviebooking.domain;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "cinemahall")
public class CinemaHall {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO)
    private int hall_id;

    private String hall_name;
    private int total_num_of_seat;
    @ManyToOne
    @JoinColumn(name="cinema_id")//,referencedColumnName="cinema_id"
    private Cinema cinema;

    public CinemaHall() {
    }

    public int getHall_id() {
        return hall_id;
    }

    public void setHall_id(int hall_id) {
        this.hall_id = hall_id;
    }

    public String getHall_name() {
        return hall_name;
    }

    public void setHall_name(String hall_name) {
        this.hall_name = hall_name;
    }

    public int getTotal_num_of_seat() {
        return total_num_of_seat;
    }

    public void setTotal_num_of_seat(int total_num_of_seat) {
        this.total_num_of_seat = total_num_of_seat;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
}
