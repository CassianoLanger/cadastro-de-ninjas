package com.clanger.cadastroDeNinjas.repository;

import com.clanger.cadastroDeNinjas.model.MissionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<MissionsModel,Long> {
}
