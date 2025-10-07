package com.clanger.cadastroDeNinjas.model.mapper;

import com.clanger.cadastroDeNinjas.model.entity.Missions;
import com.clanger.cadastroDeNinjas.model.dto.MissionsDTO;
import org.springframework.stereotype.Component;

@Component
public class MissionsMapper {

    public Missions map(MissionsDTO missionsDTO){
         return Missions.builder()
                 .id(missionsDTO.getId())
                 .name(missionsDTO.getName())
                 .level(missionsDTO.getLevel())
                 .build();

    }

    public MissionsDTO map(Missions missions){
        return MissionsDTO.builder()
                .id(missions.getId())
                .name(missions.getName())
                .level(missions.getLevel())
                .build();
    }
}
