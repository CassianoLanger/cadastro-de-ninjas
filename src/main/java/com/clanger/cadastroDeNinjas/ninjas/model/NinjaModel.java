package com.clanger.cadastroDeNinjas.ninjas.model;

import com.clanger.cadastroDeNinjas.missoes.model.MissionsModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "tb_ninjas")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private int age;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionsModel mission;
}
