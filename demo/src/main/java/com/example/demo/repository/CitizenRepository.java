package com.example.demo.repository;

import com.example.demo.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {

    Citizen findCitizenById(Integer id);
    Citizen findCitizenByName(String name);

}
