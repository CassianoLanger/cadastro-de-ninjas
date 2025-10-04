package com.clanger.cadastroDeNinjas.missions.service;

import com.clanger.cadastroDeNinjas.missions.model.MissionsModel;
import com.clanger.cadastroDeNinjas.missions.repository.MissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissionService {

    private final MissionRepository missionRepository;

    public MissionService(MissionRepository missionRepository){
        this.missionRepository = missionRepository;
    }


    public List<MissionsModel> getAll() {
        return missionRepository.findAll();
    }

    public MissionsModel postMission(MissionsModel mission) {
       return missionRepository.save(mission);
    }

    public void deleteMission(Long id) {
        missionRepository.deleteById(id);
    }

//    public MissionsModel putMission(MissionsModel mission, Long id) {
//        Optional<MissionsModel> missionOptional = missionRepository.findById(id);
//        missionRepository.
//    }
}
