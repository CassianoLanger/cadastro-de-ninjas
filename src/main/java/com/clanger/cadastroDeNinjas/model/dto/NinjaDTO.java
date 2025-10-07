package com.clanger.cadastroDeNinjas.model.dto;

import com.clanger.cadastroDeNinjas.model.entity.Missions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String name;
    private String email;
    private int age;
    private String rank;
    private Missions mission;
}
