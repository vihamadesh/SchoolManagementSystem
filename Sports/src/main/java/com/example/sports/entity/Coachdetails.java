package com.example.sports.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Coachdetails {
    private String id;
    private String firstName;
    private String coach;
    private String rep;
    


    public Coachdetails(String id, String firstName, String coach, String rep) {
        this.id = id;
        this.firstName = firstName;
        this .coach = coach;
        this.rep = rep;
    }
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getCoach() {
        return coach;
    }

    public void setGame(String coach) {
       this. coach = coach;
    }

    public String getRep() {
        return rep;
    }

    public void setRep(String rep) {
        this.rep = rep;
    }

}
