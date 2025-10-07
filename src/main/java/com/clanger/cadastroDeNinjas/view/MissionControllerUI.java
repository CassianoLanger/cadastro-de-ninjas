package com.clanger.cadastroDeNinjas.view;

import com.clanger.cadastroDeNinjas.model.dto.MissionsDTO;
import com.clanger.cadastroDeNinjas.model.service.MissionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/missions/ui")
public class MissionControllerUI {

    private final MissionService missionService;

    public MissionControllerUI(MissionService missionService) {
        this.missionService = missionService;
    }

    @GetMapping("/all")
    public String getAllMissions(Model model){
        List<MissionsDTO> missions = missionService.getAll();
        model.addAttribute("missions", missions);
        return "";
    }
}
