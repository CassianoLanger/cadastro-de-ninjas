package com.clanger.cadastroDeNinjas.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MissionsDTO {
    private Long id;
    private String name;
    private String level;
}
