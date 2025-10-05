package com.clanger.cadastroDeNinjas.controller;

import com.clanger.cadastroDeNinjas.model.dto.NinjaDTO;
import com.clanger.cadastroDeNinjas.service.NinjaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> postNinja(@RequestBody NinjaDTO ninja){
        NinjaDTO newNinja = ninjaService.saveNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("New ninja succsseful created: " + newNinja.getName() + " ID: " + newNinja.getId());
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
    public ResponseEntity<String> deleteNinja(@PathVariable Long id){

        if(ninjaService.findById(id) != null){
            ninjaService.daleteById(id);
            return ResponseEntity.ok().body("Ninja " + id + " successful deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID "+ id + " not found");
        }

    }
}
