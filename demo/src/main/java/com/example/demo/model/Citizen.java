package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "citizens")
public class Citizen {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String password;

    private boolean vaccination;

}
