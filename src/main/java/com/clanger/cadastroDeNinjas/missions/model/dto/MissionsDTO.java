package com.clanger.cadastroDeNinjas.missions.model.dto;

import com.clanger.cadastroDeNinjas.ninjas.model.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MissionsDTO {
    private Long id;
    private String name;
    private String level;
}
