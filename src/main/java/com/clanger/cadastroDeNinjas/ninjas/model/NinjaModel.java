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
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "age", nullable = false)
    private int age;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionsModel mission;
}
