package com.teameth.moviebooking.reservation;

//import com.teameth.moviebooking.service.UserService;
import com.teameth.moviebooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class MyUserDetailService implements UserDetailsService {
   @Autowired
   private UserService userService;



    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
       com.teameth.moviebooking.domain.User u1 = userService.getByUsername(userName);

        return new User(u1.getUsername(), u1.getPassword(), new ArrayList<>());
    }

}
