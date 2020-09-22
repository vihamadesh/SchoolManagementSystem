package com.example.accedamic.service;

import com.example.accedamic.entity.GameDetails;
import com.example.accedamic.repository.GameDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class GameDetailsService {

    @Autowired
    private GameDetailsRepository accedaminRepository;


    public Map<String, Object> getpage(int pageNo, int pageSize,String sortBy) {
        Map<String,Object> response=new HashMap<String, Object>();
        Sort sort=Sort.by(sortBy);
        PageRequest page = PageRequest.of(pageNo,pageSize,sort);
        Page<GameDetails> accedamicPage=accedaminRepository.findAll(page);
        response.put("data",accedamicPage.getContent());
        response.put("Total num of pages",accedamicPage.getTotalPages());
        response.put("Total num of elements",accedamicPage.getTotalElements());
        response.put("Current Page",accedamicPage.getNumber());
        return response;

    }

    public List<GameDetails> getname(String firstName) {
        return accedaminRepository.findByFirstNameStartingWith(firstName);
    }
}
