package com.clanger.cadastroDeNinjas.missoes.model;

import com.clanger.cadastroDeNinjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "tb_missions")
public class MissionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String level;

    @OneToMany(mappedBy = "mission")
    private Set<NinjaModel> ninja;

}
