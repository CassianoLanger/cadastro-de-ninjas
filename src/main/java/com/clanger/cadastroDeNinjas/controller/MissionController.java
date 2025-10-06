package com.clanger.cadastroDeNinjas.controller;

import com.clanger.cadastroDeNinjas.model.dto.MissionsDTO;
import com.clanger.cadastroDeNinjas.service.MissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<MissionsDTO>> getMissions(){
        return ResponseEntityUtil.responseEntityReturn(missionService.getAll());
    }

    @PostMapping("/new")
    public ResponseEntity<MissionsDTO> postMission(@RequestBody MissionsDTO mission){
        MissionsDTO newMission = missionService.postMission(mission);
        ResponseEntityUtil.responseEntityReturn(mission);
        return ResponseEntityUtil.responseEntityReturn(mission);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MissionsDTO> getMission(@PathVariable Long id){
        MissionsDTO mission = missionService.getMission(id);
        return ResponseEntityUtil.responseEntityReturn(mission);
    }

    @PutMapping("/{id}")
    public MissionsDTO putMission(@RequestBody MissionsDTO mission,
                                    @PathVariable Long id){
        return missionService.putMission(mission, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMission(@PathVariable Long id){
        if(missionService.getMission(id) != null){
            missionService.deleteMission(id);
            return ResponseEntity.ok().body("ID" + id + "deleted");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID" + id + " NOT FOUND");
    }
}
