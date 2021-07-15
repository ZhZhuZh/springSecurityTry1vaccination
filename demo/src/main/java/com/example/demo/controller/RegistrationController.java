package com.example.demo.controller;

import com.example.demo.model.Citizen;
import com.example.demo.service.interfaces.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    CitizenService citizenService;

    @Autowired
    public RegistrationController(CitizenService citizenService) {
        this.citizenService = citizenService;
    }

    @PostMapping("/role_citizen")
    public void addCitizen(@RequestBody Citizen user) {
        citizenService.addCitizen(user);
    }

}
