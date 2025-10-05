package com.clanger.cadastroDeNinjas.service;

import com.clanger.cadastroDeNinjas.model.MissionsModel;
import com.clanger.cadastroDeNinjas.model.dto.MissionsDTO;
import com.clanger.cadastroDeNinjas.model.mapper.MissionsMapper;
import com.clanger.cadastroDeNinjas.repository.MissionRepository;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MissionService {

    private final MissionRepository missionRepository;
    private final MissionsMapper missionsMapper;

    public MissionService(MissionRepository missionRepository, MissionsMapper missionsMapper){
        this.missionRepository = missionRepository;
        this.missionsMapper = missionsMapper;
    }


    public List<MissionsDTO> getAll() {
        List<MissionsModel> missions = new LinkedList<>(missionRepository.findAll());
        return missions.stream().map(missionsMapper::map).collect(Collectors.toList());
    }

    public MissionsDTO postMission(MissionsDTO missionsDTO) {
        MissionsModel mission = missionsMapper.map(missionsDTO);
        mission = missionRepository.save(mission);
        return missionsMapper.map(mission);
    }

    public void deleteMission(Long id) {
        missionRepository.deleteById(id);
    }

    public MissionsDTO putMission(MissionsDTO missionsDTO, Long id) {
        if(missionRepository.existsById(id)){
            missionsDTO.setId(id);
            MissionsModel mission = missionsMapper.map(missionsDTO);
            return missionsMapper.map(missionRepository.save(mission));
        } else {
            return null;
        }
    }

    public MissionsDTO getMission(Long id) {
        return missionRepository.findById(id).map(missionsMapper::map).orElse(null);
    }
}
