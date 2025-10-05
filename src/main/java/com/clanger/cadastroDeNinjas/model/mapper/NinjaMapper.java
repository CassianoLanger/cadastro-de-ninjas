package com.clanger.cadastroDeNinjas.model.mapper;

import com.clanger.cadastroDeNinjas.model.NinjaModel;
import com.clanger.cadastroDeNinjas.model.dto.NinjaDTO;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO){
        return NinjaModel.builder()
                .id(ninjaDTO.getId())
                .name(ninjaDTO.getName())
                .email(ninjaDTO.getEmail())
                .age(ninjaDTO.getAge())
                .rank(ninjaDTO.getRank())
                .mission(ninjaDTO.getMission())
                .build();
    }

    public NinjaDTO map(NinjaModel ninjaModel){
        return NinjaDTO.builder()
                .id(ninjaModel.getId())
                .name(ninjaModel.getName())
                .email(ninjaModel.getEmail())
                .age(ninjaModel.getAge())
                .rank(ninjaModel.getRank())
                .mission(ninjaModel.getMission())
                .build();
    }
}
