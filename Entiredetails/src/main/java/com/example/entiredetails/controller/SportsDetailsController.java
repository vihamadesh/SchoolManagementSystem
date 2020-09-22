package com.example.entiredetails.controller;

import com.example.entiredetails.entity.Coachdetails;
import com.example.entiredetails.entity.GameDetails;
import com.example.entiredetails.entity.SportsDetails;
import com.example.entiredetails.repository.SportsDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

@RestController
public class SportsDetailsController {

    @Autowired
    protected RestTemplate restTemplate;

    @Autowired
    private SportsDetailsRepository repository;

    @PostMapping("/addDetails")
    public String saveDetails(@RequestBody SportsDetails details) {
        details.save(details);
        return "Added Details with id : " + details.getId();
    }

    @GetMapping("/findAllcoach/{id}")
    private Coachdetails getCoach(@PathVariable String id) {
        String url = "http://localhost:8083/findAllDetail/" + id;

        ResponseEntity<Coachdetails> sports;
        try {
            sports = restTemplate.exchange(url, HttpMethod.GET, null, Coachdetails.class);
            return sports.getBody();
        } catch (ResourceAccessException resourceAccessException) {
            throw new ResourceAccessException("Internal Server Error");

        }
    }
   

    @GetMapping("/findAllgamedetails/{id}")
    private GameDetails getGamedetails(@PathVariable String id) {
        String url = "http://localhost:8082/findAllDetails/" + id;

        ResponseEntity<GameDetails> accedamic;
        try {
            accedamic = restTemplate.exchange(url, HttpMethod.GET, null, GameDetails.class);
            return accedamic.getBody();
        } catch (ResourceAccessException resourceAccessException) {
            throw new ResourceAccessException("Internal Server Error");

        }
    }

    
}
