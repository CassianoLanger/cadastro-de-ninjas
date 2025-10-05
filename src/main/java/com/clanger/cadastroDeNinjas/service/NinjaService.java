package com.clanger.cadastroDeNinjas.service;

import com.clanger.cadastroDeNinjas.model.mapper.NinjaMapper;
import com.clanger.cadastroDeNinjas.model.NinjaModel;
import com.clanger.cadastroDeNinjas.model.dto.NinjaDTO;
import com.clanger.cadastroDeNinjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;
    private final NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> getAllNinjas(){
        List<NinjaModel> ninjas = new LinkedList<>(ninjaRepository.findAll());
        return ninjas.stream().map(ninjaMapper::map).collect(Collectors.toList());
    }

    public NinjaDTO saveNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    public NinjaDTO findById(Long id){
        return ninjaRepository.findById(id).map(ninjaMapper::map).orElse(null);
    }

    public void daleteById(Long id){
        ninjaRepository.deleteById(id);
    }

    public NinjaDTO putNinja(Long id, NinjaDTO ninja) {
        Optional<NinjaModel> ninjaOptional = ninjaRepository.findById(id);
        if(ninjaOptional.isPresent()){
            NinjaModel ninjaModel = ninjaMapper.map(ninja);
            ninjaModel.setId(id);
           return ninjaMapper.map(ninjaRepository.save(ninjaModel));
        } else {
            return null;
        }
    }
}
