package com.clanger.cadastroDeNinjas.view;

import com.clanger.cadastroDeNinjas.model.dto.NinjaDTO;
import com.clanger.cadastroDeNinjas.model.service.NinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ninjas/ui")
public class NinjaControllerUI {

    private final NinjaService ninjaService;

    public NinjaControllerUI(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/all")
    public String getAllNinjas(Model model){
        List<NinjaDTO> ninjas = ninjaService.getAllNinjas();
        model.addAttribute("ninjas", ninjas);
        return "getAllNinjas";
    }
}
