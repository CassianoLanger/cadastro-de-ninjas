package com.clanger.cadastroDeNinjas.ninjas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @GetMapping("/boas-vindas")
    public String boasVindas(){
        return "primeira mensagem nessa rota";
    }

    // Adicionar ninja(Create)
    @GetMapping("/new-ninja")
    public String postNinja(){
        return "New ninja is on db now";
    }

    // Mostrar todos os ninjas(Read)
    @GetMapping("/all")
    public String getAllNinjas(){
        return "all";
    }

    // Procurar ninja por ID(Read)
    @GetMapping("/get-id")
    public String getNinjaById(){
        return "id: " ;
    }

    //Alterar dados do ninja(Update)
    @PutMapping("/update-ninja")
    public String updateNinja(){
        return "id: 1";
    }

    //Deletar Ninja(Delete)
    @DeleteMapping("/delete-ninja")
    public String deleteNinja(){
        return "id: 2";
    }
}
