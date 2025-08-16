package com.example.main.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.main.entity.user;
import com.example.main.repository.userRepository;

public class customuserdetailsservices implements UserDetailsService {

    @Autowired
    private userRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
      user user =repo.findByEmail(email);
        if (user==null){
        throw new UsernameNotFoundException("user not found");
        }
          return new customuserdetails(user);
    }
}