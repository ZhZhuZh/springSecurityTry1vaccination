package com.example.demo.service;

import com.example.demo.model.Citizen;
import com.example.demo.repository.CitizenRepository;
import com.example.demo.service.interfaces.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CitizenServiceImpl implements CitizenService {

    CitizenRepository repository;

    @Autowired
    public CitizenServiceImpl(CitizenRepository repository) {
        this.repository = repository;
    }

    public Citizen getCitizenById(Integer id) {
        return repository.findCitizenById(id);
    }

    public Citizen getCitizenByName(String name) {
        return repository.findCitizenByName(name);
    }

    public List<Citizen> getAllCitizens() {
        return repository.findAll();
    }

    public void addCitizen(Citizen citizen) {

    }

}
