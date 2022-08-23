package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.IzdaniRacuni;
import org.db2.murko.presker.api.healthresort.services.IIzdaniRacuniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/izdani-racuni")
public class IzdaniRacuniController {

    @Autowired
    private IIzdaniRacuniService service;

    private final String IZDANI_RACUNI_VIEW = "izdaniRacuniView";
    private final String IZDANI_RACUNI_LIST_VIEW = "izdaniRacuniListViev";


    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return IZDANI_RACUNI_VIEW;
    }

    @RequestMapping(value = "/getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        IzdaniRacuni racun = service.get(id);
        if (racun != null) {
            racun.toString();
            model.addAttribute("id", racun.getId_izdani_racuni());
            model.addAttribute("st_rac", racun.getSt_racuna());
            model.addAttribute("datum", racun.getDatum_racuna());
            model.addAttribute("id_pos_en", racun.getId_poslovne_enote());
            model.addAttribute("id_blagajne", racun.getId_blagajne());
            model.addAttribute("id_zaposleni", racun.getId_zaposleni());
            model.addAttribute("ZOI", racun.getZoi());
            model.addAttribute("EOR", racun.getEor());
            model.addAttribute("id_tr_rac_pos_en", racun.getId_transakcijski_racuni_poslovne_enote());
            model.addAttribute("id_rezervacije", racun.getId_rezervacije());
        } else {
            model.addAttribute("error", "Id ne obstaja!");
        }
        return IZDANI_RACUNI_VIEW;
    }

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<IzdaniRacuni> racuni = service.getAll();
        System.out.println("List of IzdaniRacuni: " + racuni);
        model.addAttribute("racuni", racuni);
        return IZDANI_RACUNI_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return IZDANI_RACUNI_VIEW;
    }
}
