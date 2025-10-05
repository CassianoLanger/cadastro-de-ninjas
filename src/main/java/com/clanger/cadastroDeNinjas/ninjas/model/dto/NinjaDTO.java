package com.clanger.cadastroDeNinjas.ninjas.model.dto;

import com.clanger.cadastroDeNinjas.missions.model.MissionsModel;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private MissionsModel mission;
}
