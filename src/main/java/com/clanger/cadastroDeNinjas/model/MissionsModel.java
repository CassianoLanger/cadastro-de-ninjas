package com.clanger.cadastroDeNinjas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "tb_missions")
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MissionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "level", nullable = false)
    private String level;

    @OneToMany(mappedBy = "mission")
    @JsonIgnore
    private Set<NinjaModel> ninja;

}
