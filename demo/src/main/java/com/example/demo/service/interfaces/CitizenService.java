package com.example.demo.service.interfaces;

import com.example.demo.model.Citizen;

import java.util.List;

public interface CitizenService {

    Citizen getCitizenById(Integer id);

    Citizen getCitizenByName(String name);

    List<Citizen> getAllCitizens();

    void addCitizen(Citizen citizen);

}
