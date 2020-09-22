package com.example.sports.service;

import com.example.sports.entity.Coachdetails;
import com.example.sports.repository.CoachdetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoachdetailsService {

    @Autowired
    private CoachdetailsRepository coachdetailsRepository;


    public Map<String, Object> getpage(int pageNo, int pageSize, String sortBy) {
        Map<String,Object> response=new HashMap<String, Object>();
        Sort sort=Sort.by(sortBy);
        PageRequest page = PageRequest.of(pageNo,pageSize,sort);
        Page<Coachdetails> accedamicPage=coachdetailsRepository.findAll(page);
        response.put("data",accedamicPage.getContent());
        response.put("Total num of pages",accedamicPage.getTotalPages());
        response.put("Total num of elements",accedamicPage.getTotalElements());
        response.put("Current Page",accedamicPage.getNumber());
        return response;

    }


    public List<Coachdetails> getnumberofstudents(int numberofstudents) {
        return coachdetailsRepository.abc(numberofstudents);
    }


    public List<Coachdetails> getname(String firstName) {
        return coachdetailsRepository.findByFirstNameStartingWith(firstName);
    }
}
