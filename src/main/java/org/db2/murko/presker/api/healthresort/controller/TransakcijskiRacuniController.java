package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.TransakcijskiRacuni;
import org.db2.murko.presker.api.healthresort.services.ITransakcijskiRacuniServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "transakcijski-racuni")
public class TransakcijskiRacuniController {

    @Autowired
    private ITransakcijskiRacuniServis service;

    private final String RACUNI_VIEW = "transakcijskiRacuniView";
    private final String RACUNI_LIST_VIEW = "transakcijskiRacuniListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return RACUNI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap modelMap) {
        TransakcijskiRacuni racun = service.get(id);
        if (racun != null) {
            racun.toString();
            modelMap.addAttribute("id_tra_rac", racun.getId_transakcijski_racuni());
            modelMap.addAttribute("tra_rac", racun.getTransakcijski_racun());
            modelMap.addAttribute("id_pos_par", racun.getId_poslovni_partnerji());
            modelMap.addAttribute("id_pp_banke", racun.getId_pp_banke());
        } else {
            modelMap.addAttribute("error", "Id ne obstaja!");
        }
        return RACUNI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<TransakcijskiRacuni> racuni = service.getAll();
        model.addAttribute("racuni", racuni);
        return RACUNI_LIST_VIEW;
    }

    @RequestMapping(value = "back")
    public String back() {
        return RACUNI_VIEW;
    }
}
