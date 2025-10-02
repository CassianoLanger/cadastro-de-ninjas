package com.clanger.cadastroDeNinjas.ninjas.repository;

import com.clanger.cadastroDeNinjas.ninjas.model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel,Long> {
}
