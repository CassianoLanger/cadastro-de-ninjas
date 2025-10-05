package com.clanger.cadastroDeNinjas.missions.controller;

import com.clanger.cadastroDeNinjas.missions.model.dto.MissionsDTO;
import com.clanger.cadastroDeNinjas.missions.service.MissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missions")
public class MissionController {

    private final MissionService missionService;

    public MissionController(MissionService missionService){
        this.missionService = missionService;
    }

    @GetMapping("/all")
    public List<MissionsDTO> getMissions(){
        return missionService.getAll();
    }

    @PostMapping("/new")
    public MissionsDTO postMission(@RequestBody MissionsDTO mission){
        return missionService.postMission(mission);
    }

    @PutMapping("/{id}")
    public MissionsDTO putMission(@RequestBody MissionsDTO mission,
                                    @PathVariable Long id){
        return missionService.putMission(mission, id);
    }

    @DeleteMapping("/{id}")
    public void deleteMission(@PathVariable Long id){
        missionService.deleteMission(id);
    }
}
