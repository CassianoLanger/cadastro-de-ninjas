package com.clanger.cadastroDeNinjas.model.mapper;

import com.clanger.cadastroDeNinjas.model.entity.Ninja;
import com.clanger.cadastroDeNinjas.model.dto.NinjaDTO;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public Ninja map(NinjaDTO ninjaDTO){
        return Ninja.builder()
                .id(ninjaDTO.getId())
                .name(ninjaDTO.getName())
                .email(ninjaDTO.getEmail())
                .age(ninjaDTO.getAge())
                .rank(ninjaDTO.getRank())
                .mission(ninjaDTO.getMission())
                .build();
    }

    public NinjaDTO map(Ninja ninja){
        return NinjaDTO.builder()
                .id(ninja.getId())
                .name(ninja.getName())
                .email(ninja.getEmail())
                .age(ninja.getAge())
                .rank(ninja.getRank())
                .mission(ninja.getMission())
                .build();
    }
}
