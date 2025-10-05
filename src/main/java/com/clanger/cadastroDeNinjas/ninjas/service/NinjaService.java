package com.clanger.cadastroDeNinjas.ninjas.service;

import com.clanger.cadastroDeNinjas.ninjas.model.mapper.NinjaMapper;
import com.clanger.cadastroDeNinjas.ninjas.model.NinjaModel;
import com.clanger.cadastroDeNinjas.ninjas.model.dto.NinjaDTO;
import com.clanger.cadastroDeNinjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;
    private final NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaModel> getAllNinjas(){
        return ninjaRepository.findAll();
    }

    public NinjaDTO saveNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
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
