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
    @PostMapping("/new-ninja")
    public NinjaDTO postNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.saveNinja(ninja);
    }

    // Mostrar todos os ninjas(Read)
    @GetMapping("/all")
    public List<NinjaModel> getAllNinjas(){
        return ninjaService.getAllNinjas();
    }

    // Procurar ninja por ID(Read)
    @GetMapping("/ninja/{id}")
    public NinjaModel getNinjaById(@PathVariable Long id){
        return ninjaService.findById(id);
    }

    //Alterar dados do ninja(Update)
    @PutMapping("/update-ninja/{id}")
    public NinjaModel updateNinja(@PathVariable Long id,
                              @RequestBody NinjaModel ninja){
        return ninjaService.putNinja(id, ninja);
    }

    //Deletar Ninja(Delete)
    @DeleteMapping("/delete-ninja/{id}")
    public void deleteNinja(@PathVariable Long id){
         ninjaService.daleteById(id);
    }
}
