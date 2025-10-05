package com.clanger.cadastroDeNinjas.repository;

import com.clanger.cadastroDeNinjas.model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel,Long> {
}
