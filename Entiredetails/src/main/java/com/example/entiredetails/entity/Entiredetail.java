package com.example.entiredetails.entity;

import com.example.entiredetails.repository.SportsDetailsRepository;

import java.util.Optional;

public class Entiredetail {
        private String id;
        private String firtName;
        private GameDetails gameDetails;

        public Entiredetail(String id, String firtName) {
            this.id = id;
            this.firtName = firtName;
            //this.accedamic=accedamic;
        }

        public Entiredetail(Optional<SportsDetailsRepository> details, GameDetails accedamic){

        }

       public GameDetails getGameDetails() {
            return gameDetails;
        }

        public void setGameDetails(GameDetails gameDetails) {
            this.gameDetails = gameDetails;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFirtName() {
            return firtName;
        }

        public void setFirtName(String firtName) {
            this.firtName = firtName;
        }

        public void save(SportsDetails details) {
        }
    }


