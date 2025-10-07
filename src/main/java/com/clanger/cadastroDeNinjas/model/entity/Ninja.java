package com.clanger.cadastroDeNinjas.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_ninjas")
@Data
@Builder
@ToString(exclude = "mission")
@NoArgsConstructor
@AllArgsConstructor
public class Ninja {

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

    @Column(name = "rank")
    private String rank;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Missions mission;
}
