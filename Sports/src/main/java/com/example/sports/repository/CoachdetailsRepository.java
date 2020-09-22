package com.example.sports.repository;

import com.example.sports.entity.Coachdetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CoachdetailsRepository extends MongoRepository<Coachdetails, String> {
    List<Coachdetails> findByFirstNameStartingWith(String firstName);

    @Query(value = "{'numberofstudents':{$gte:?0}}")
    List<Coachdetails> abc(int numberofstudents);
    //List<Coachdetails> findByFirstNameStartingWith(String firstName);
}
