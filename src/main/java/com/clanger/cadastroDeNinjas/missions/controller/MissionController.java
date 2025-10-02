package com.clanger.cadastroDeNinjas.missions.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mission")
public class MissionController {

    @GetMapping("/get-missions")
    public String getMissions(){
        return "missions";
    }

    @PostMapping("/new-mission")
    public String postMission(){
        return "missions d-c-b-a-s";
    }

    @PutMapping("/update-mission")
    public String putMission(){
        return "mission updated";
    }

    @DeleteMapping("/delete-mission")
    public String deleteMission(){
        return "mission deleted";
    }
}
