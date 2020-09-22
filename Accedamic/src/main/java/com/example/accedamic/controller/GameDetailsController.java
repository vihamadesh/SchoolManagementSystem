package com.example.accedamic.controller;

import com.example.accedamic.entity.GameDetails;
import com.example.accedamic.repository.GameDetailsRepository;
import com.example.accedamic.service.GameDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
public class GameDetailsController {
    
    @Autowired
    private GameDetailsRepository accedaminRepository;

    

    @Autowired
    protected RestTemplate restTemplate;

        @PostMapping("/addDetails")
        public String saveDetails(@RequestBody GameDetails accedamic) {
            accedaminRepository.save(accedamic);
            return "Added Details with id : " + accedamic.getId();
        }
  

        @GetMapping("/findAllDetails")
        public List<GameDetails> getDetails() {
            return accedaminRepository.findAll();
        }


/*

    @GetMapping("/findAllDetails/{firstName}")
    public Optional<Accedamic> getDetails(@PathVariable String firstName)
    {
        return accedaminRepository.findById(firstName);
    }*/

    @GetMapping("/findAllDetails/{id}")
    public Optional<GameDetails> getDetails(@PathVariable String id)
    {
        return accedaminRepository.findById(id);
    }

    @Autowired(required = true)
    private GameDetailsService accedamicService;
    @GetMapping("/findAllpage")
    public Map<String ,Object> getpage(@RequestParam (name="pageNo",defaultValue = "0") int pageNo,
                                          @RequestParam (name="pageSize",defaultValue = "2") int pageSize,
                                          @RequestParam (name="sortBy",defaultValue = "id") String sortBy)
    {
        return accedamicService.getpage(pageNo,pageSize,sortBy);
    }
    
    @GetMapping("/findByName")
    public List<GameDetails> getname(@RequestParam (name="firstName") String firstName){
        return accedamicService.getname(firstName);
    }





    @DeleteMapping("/delete/{id}")
        public String deletDetails(@PathVariable String id ) {
            accedaminRepository.deleteById(id);
            return "Detail deleted with id : " + id;
        }

    }

