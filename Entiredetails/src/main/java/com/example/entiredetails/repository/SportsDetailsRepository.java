package com.example.entiredetails.repository;

import com.example.entiredetails.entity.GameDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SportsDetailsRepository extends MongoRepository<SportsDetailsRepository, String> {
    
}
