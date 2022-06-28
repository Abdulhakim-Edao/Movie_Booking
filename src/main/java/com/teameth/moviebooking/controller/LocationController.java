package com.teameth.moviebooking.controller;

import com.teameth.moviebooking.domain.Location;
import com.teameth.moviebooking.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;



    @RequestMapping("/location")
    public List<Location> getAllLocations(){
        return locationService.getAllLocation();
    }

    @RequestMapping(method = RequestMethod.POST ,value="/location")
    public void saveNewLocation(@RequestBody Location location){

        locationService.saveLocation(location);
    }
}
