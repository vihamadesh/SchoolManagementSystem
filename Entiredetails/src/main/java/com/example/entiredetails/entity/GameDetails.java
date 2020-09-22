package com.example.entiredetails.entity;

public class GameDetails {
    private String id;
    private String firstName;
    private String info;
    private int numberofstudents;

  
    public GameDetails(){}
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public  int getNumberofstudents() {
        return numberofstudents;
    }

    public void setNumberofstudents(int numberofstudents) {
        this.numberofstudents = numberofstudents;
    }

    public GameDetails(String id, String firstName, String info, int numberofstudents) {
        this.id = id;
        this.firstName = firstName;
        this.info =info;
        this.numberofstudents = numberofstudents;
    }
}
