package com.clanger.cadastroDeNinjas.missoes.repository;

import com.clanger.cadastroDeNinjas.missoes.model.MissionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<MissionsModel,Long> {
}
