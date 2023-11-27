package com.cricket.live.controller;

import com.cricket.live.model.Match;
import com.cricket.live.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cricket")
@CrossOrigin("*")
public class CricketController {

    @Autowired
    private CricketService cricketService;

    @GetMapping("/live")
    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException {
        System.out.println("getting live match");
        return new ResponseEntity<>(cricketService.getLiveMatchScores(), HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity<List<Match>> getAllMatches() {
//        return new ResponseEntity<>(cricketService.getAllMatches(), HttpStatus.OK);
//    }

}
