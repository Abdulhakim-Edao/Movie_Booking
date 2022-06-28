package com.teameth.moviebooking.repository;

import com.teameth.moviebooking.domain.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema,Integer> {
}
