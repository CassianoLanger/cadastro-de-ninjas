package com.clanger.cadastroDeNinjas.ninjas.model;

import com.clanger.cadastroDeNinjas.missoes.model.MissionsModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_ninjas")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private int age;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionsModel mission;
}
