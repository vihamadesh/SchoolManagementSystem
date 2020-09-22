package com.example.accedamic.repository;

import com.example.accedamic.entity.GameDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameDetailsRepository extends MongoRepository<GameDetails, String>{

    List<GameDetails> findByFirstNameStartingWith(String firstName);


}
