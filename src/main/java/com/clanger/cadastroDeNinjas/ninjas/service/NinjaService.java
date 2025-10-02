package com.clanger.cadastroDeNinjas.ninjas.service;

import com.clanger.cadastroDeNinjas.ninjas.model.NinjaModel;
import com.clanger.cadastroDeNinjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> getAllNinjas(){
        return ninjaRepository.findAll();
    }

    public NinjaModel saveNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }
}
