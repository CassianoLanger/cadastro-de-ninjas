package com.clanger.cadastroDeNinjas.missions.repository;

import com.clanger.cadastroDeNinjas.missions.model.MissionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<MissionsModel,Long> {
}
