package com.clanger.cadastroDeNinjas.ninjas.service;

import com.clanger.cadastroDeNinjas.ninjas.model.NinjaModel;
import com.clanger.cadastroDeNinjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> getAllNinjas(){
        return ninjaRepository.findAll();
    }

    public NinjaModel saveNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    public NinjaModel findById(Long id){
        Optional<NinjaModel> ninjaById = ninjaRepository.findById(id);
        return ninjaById.orElse(null);
    }

    public void daleteById(Long id){
        ninjaRepository.deleteById(id);
    }

    public NinjaModel putNinja(Long id, NinjaModel ninja) {
        if(ninjaRepository.existsById(id)){
            ninja.setId(id);
           return ninjaRepository.save(ninja);
        } else {
            return null;
        }
    }
}
