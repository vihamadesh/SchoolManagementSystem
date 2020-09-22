package com.example.entiredetails.entity;

import com.example.entiredetails.repository.SportsDetailsRepository;

import java.util.Optional;

public class SportsDetails {
    private String id;
    private String firstName;

    public SportsDetails(String id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }


    public SportsDetails(Optional<SportsDetailsRepository> details, GameDetails accedamic){

    }
    public SportsDetails(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void save(SportsDetails details) {
    }
}
