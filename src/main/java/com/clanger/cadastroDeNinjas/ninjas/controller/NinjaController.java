package com.clanger.cadastroDeNinjas.ninjas.controller;

import com.clanger.cadastroDeNinjas.ninjas.model.NinjaModel;
import com.clanger.cadastroDeNinjas.ninjas.model.dto.NinjaDTO;
import com.clanger.cadastroDeNinjas.ninjas.service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boas-vindas")
    public String boasVindas(){
        return "primeira mensagem nessa rota";
    }

    // Adicionar ninja(Create)
    @PostMapping("/new")
    public NinjaDTO postNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.saveNinja(ninja);
    }

    // Mostrar todos os ninjas(Read)
    @GetMapping("/all")
    public List<NinjaDTO> getAllNinjas(){
        return ninjaService.getAllNinjas();
    }

    // Procurar ninja por ID(Read)
    @GetMapping("/{id}")
    public NinjaDTO getNinjaById(@PathVariable Long id){
        return ninjaService.findById(id);
    }

    //Alterar dados do ninja(Update)
    @PutMapping("/{id}")
    public NinjaDTO updateNinja(@PathVariable Long id,
                              @RequestBody NinjaDTO ninja){
        return ninjaService.putNinja(id, ninja);
    }

    //Deletar Ninja(Delete)
    @DeleteMapping("/{id}")
    public void deleteNinja(@PathVariable Long id){
         ninjaService.daleteById(id);
    }
}
