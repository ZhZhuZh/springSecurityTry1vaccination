package com.example.demo.service;

import com.example.demo.model.Citizen;
import com.example.demo.model.Role;
import com.example.demo.repository.CitizenRepository;
import com.example.demo.service.interfaces.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CitizenServiceImpl implements CitizenService {

    private final CitizenRepository repository;

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
        citizen.setPassword(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode(citizen.getPassword()));
        citizen.setRoles(Collections.singleton(new Role(2, "ROLE_USER")));
        repository.save(citizen);
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        return getCitizenByName(name);
    }

}
