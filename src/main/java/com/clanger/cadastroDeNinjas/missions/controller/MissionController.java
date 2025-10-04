package com.clanger.cadastroDeNinjas.missions.controller;

import com.clanger.cadastroDeNinjas.missions.model.MissionsModel;
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
    public List<MissionsModel> getMissions(){
        return missionService.getAll();
    }

    @PostMapping("/new")
    public MissionsModel postMission(@RequestBody MissionsModel mission){
        return missionService.postMission(mission);
    }

//    @PutMapping("/{id}}")
//    public MissionsModel putMission(@RequestBody MissionsModel mission,
//                                    @PathVariable Long id){
//        return missionService.putMission(mission, id);
//    }

    @DeleteMapping("/{id}")
    public void deleteMission(@PathVariable Long id){
        missionService.deleteMission(id);
    }
}
