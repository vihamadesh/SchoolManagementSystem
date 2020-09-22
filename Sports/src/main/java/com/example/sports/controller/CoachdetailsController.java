package com.example.sports.controller;

import com.example.sports.entity.Coachdetails;
import com.example.sports.repository.CoachdetailsRepository;
import com.example.sports.service.CoachdetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class CoachdetailsController {

    @Autowired
    private CoachdetailsRepository sportsRepositoy;

    @PostMapping("/addDetail")
    public String saveDetails(@RequestBody com.example.sports.entity.Coachdetails sports) {
        sportsRepositoy.save(sports);
        return "Added Details with id : " + sports.getId();
    }

    @GetMapping("/findAllDetail")
    public List<com.example.sports.entity.Coachdetails> getDetails() {
        return sportsRepositoy.findAll();
    }


    @GetMapping("/findAllDetail/{id}")
    public Optional<com.example.sports.entity.Coachdetails> getDetails(@PathVariable String id) {
        return sportsRepositoy.findById(id);
    }

    @Autowired(required = true)
    private CoachdetailsService coachdetailsService;
    @GetMapping("/findAllpage")
    public Map<String ,Object> getpage(@RequestParam (name="pageNo",defaultValue = "0") int pageNo,
                                       @RequestParam (name="pageSize",defaultValue = "2") int pageSize,
                                       @RequestParam (name="sortBy",defaultValue = "id") String sortBy)
    {
        return coachdetailsService.getpage(pageNo,pageSize,sortBy);
    }
    @GetMapping("/findnumberofstudents")
    public List<Coachdetails> getnumberofstudents(@RequestParam (name="numberofstudents") int numberofstudents){
        return coachdetailsService.getnumberofstudents(numberofstudents);
    }

    @GetMapping("/findByName")
    public List<Coachdetails> getname(@RequestParam (name="firstName") String firstName){
        return coachdetailsService.getname(firstName);
    }


    @DeleteMapping("/delete/{id}")
    public String deletDetails(@PathVariable String id ) {
        sportsRepositoy.deleteById(id);
        return "Detail deleted with id : " + id;
    }
}
