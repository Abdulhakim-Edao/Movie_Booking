package com.teameth.moviebooking.service;

import com.teameth.moviebooking.domain.CinemaHall;
import com.teameth.moviebooking.repository.CinemaHallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaHallService {
    @Autowired
    CinemaHallRepository cinemaHallRepository;
    public List<CinemaHall> getAllCinemaHall() {
        return cinemaHallRepository.findAll();
    }

    public void saveCinemaHall(CinemaHall cinemaHall) {
        cinemaHallRepository.save(cinemaHall);
    }
}
