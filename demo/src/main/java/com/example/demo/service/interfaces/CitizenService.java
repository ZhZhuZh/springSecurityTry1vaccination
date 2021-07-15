package com.example.demo.service.interfaces;

import com.example.demo.model.Citizen;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface CitizenService extends UserDetailsService{

    Citizen getCitizenById(Integer id);

    Citizen getCitizenByName(String name);

    List<Citizen> getAllCitizens();

    void addCitizen(Citizen citizen);

}
