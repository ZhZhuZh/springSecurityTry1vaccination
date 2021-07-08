package com.example.demo.controller;

import com.example.demo.model.Citizen;
import com.example.demo.service.interfaces.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitizenController {

    @Autowired
    CitizenService citizenService;

    @GetMapping("/vacOn")
    public String vaccinationOn() {

        return "Hahahahahaha, I can eat and sit in a cafe!";

    }

    @GetMapping("/vacOff")
    public String vaccinationOff() {

        return "Oh, I want to sit on bench so much, but I can't :(";

    }

    @GetMapping("/citizens")
    public List<Citizen> getAllCitizens() {

        return citizenService.getAllCitizens();

    }

    @PostMapping("/citizen")
    public void addCitizen(@RequestBody Citizen citizen) {

        citizenService.addCitizen(citizen);

    }

}
