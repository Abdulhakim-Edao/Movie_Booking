package com.teameth.moviebooking.controller;

import com.teameth.moviebooking.domain.Cinema;
import com.teameth.moviebooking.domain.Location;
import com.teameth.moviebooking.models.CinemaRequest;
import com.teameth.moviebooking.service.CinemaHallService;
import com.teameth.moviebooking.service.CinemaService;
import com.teameth.moviebooking.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CinemaController {


    @Autowired
    private CinemaService cinemaService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private CinemaHallService cinemaHallService;



    @RequestMapping("/cinema")
    public List<Cinema> getAllLocations(){
        return cinemaService.getAllCinema();
    }
    @RequestMapping(method = RequestMethod.POST ,value="/{locationid}/cinema")
    public void saveNewCinema(@RequestBody Cinema cinema ,@PathVariable Integer locationid){
        Location location = locationService.getSpecificLocation(locationid);
        cinema.setLocation(location);
        cinemaService.saveCinema(cinema);
    }

    /*@RequestMapping(method = RequestMethod.POST ,value="/{locationid}/cinema")
    public void saveNewLocation(@RequestBody Cinema cinema ,@PathVariable Integer locationid){
         Location location = locationService.getSpecificLocation(locationid);
        cinema.setLocation(location);
        cinemaService.saveCinema(cinema);
    }*/
    @RequestMapping(method = RequestMethod.POST ,value="/{locationid}/cinema/cin")
    public void saveNewCinenmaAndHalls(@RequestBody CinemaRequest cinemaRequest , @PathVariable Integer locationid){
        Location location = locationService.getSpecificLocation(locationid);
      //  cinema.setLocation(location);
        Cinema cinema = new Cinema( cinemaRequest.getCinema_id(),cinemaRequest.getCinema_name(),locationid,cinemaRequest.getNumber_of_halls());

        cinema.setLocation(location);
        //
        cinemaService.saveCinema(cinema);
    }



}
