package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.RezervacijeSobe;
import org.db2.murko.presker.api.healthresort.services.IRezervacijeSobeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/rezervacije-sobe")
public class RezervacijeSobeController {

    @Autowired
    private IRezervacijeSobeService service;

    private final String SOBE_VIEW = "rezervacijeSobeView";
    private final String SOBE_LIST_VIEW = "rezervacijeSobeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return SOBE_VIEW;
    }

    @RequestMapping(value = "/getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap modelMap) {
        RezervacijeSobe soba = service.get(id);
        if (soba != null) {
            soba.toString();
            modelMap.addAttribute("id_rez_sobe", soba.getId_rezervacije_sobe());
            modelMap.addAttribute("id_rez", soba.getId_rezervacije());
            modelMap.addAttribute("id_sobe", soba.getId_sobe());
            modelMap.addAttribute("datum_od", soba.getDatum_od());
            modelMap.addAttribute("datum_do", soba.getDatum_do());
        } else {
            modelMap.addAttribute("error", "Id ne obstaja!");
        }
        return SOBE_VIEW;
    }

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public String getList(ModelMap modelMap) {
        List<RezervacijeSobe> list = service.getAll();
        modelMap.addAttribute("sobe", list);
        return SOBE_LIST_VIEW;
    }

    @RequestMapping(value = "back")
    public String back() {
        return SOBE_VIEW;
    }
}
