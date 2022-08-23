package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Sobe;
import org.db2.murko.presker.api.healthresort.services.ISobeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "sobe")
public class SobeController {

    @Autowired
    private ISobeService service;

    private final String SOBE_VIEW = "sobeView";
    private final String SOBE_LIST_VIEW = "sobeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return SOBE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap modelMap) {
        Sobe soba = service.get(id);
        if (soba != null) {
            soba.toString();
            modelMap.addAttribute("id_sobe", soba.getId_sobe());
            modelMap.addAttribute("st_sob", soba.getStevilka_sobe());
            modelMap.addAttribute("id_objekti", soba.getId_objekti());
            modelMap.addAttribute("id_kat", soba.getId_kategorije());
            modelMap.addAttribute("id_sob_st", soba.getId_sobe_statusi());
        } else {
            modelMap.addAttribute("error", "Id ne obstaja!");
        }
        return SOBE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap modelMap) {
        List<Sobe> sobe = service.getAll();
        modelMap.addAttribute("sobe", sobe);
        return SOBE_LIST_VIEW;
    }

    @RequestMapping(value = "back")
    public String back() {
        return SOBE_VIEW;
    }
}
