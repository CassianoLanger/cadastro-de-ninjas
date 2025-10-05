package com.clanger.cadastroDeNinjas.model.mapper;

import com.clanger.cadastroDeNinjas.model.MissionsModel;
import com.clanger.cadastroDeNinjas.model.dto.MissionsDTO;
import org.springframework.stereotype.Component;

@Component
public class MissionsMapper {

    public MissionsModel map(MissionsDTO missionsDTO){
         return MissionsModel.builder()
                 .id(missionsDTO.getId())
                 .name(missionsDTO.getName())
                 .level(missionsDTO.getLevel())
                 .build();

    }

    public MissionsDTO map(MissionsModel missionsModel){
        return MissionsDTO.builder()
                .id(missionsModel.getId())
                .name(missionsModel.getName())
                .level(missionsModel.getLevel())
                .build();
    }
}
