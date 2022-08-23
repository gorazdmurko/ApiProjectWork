package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Rezervacije;
import org.db2.murko.presker.api.healthresort.services.IRezervacijeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "rezervacije")
public class RezervacijeController {

    @Autowired
    private IRezervacijeService service;

    private final String REZERVACIJE_VIEW = "rezervacijeView";
    private final String REZERVACIJE_LIST_VIEW = "rezervacijeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return REZERVACIJE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        Rezervacije rezervacija = service.get(id);
        if (rezervacija != null) {
            rezervacija.toString();
            model.addAttribute("id_rez", rezervacija.getId_rezervacije());
            model.addAttribute("id_pos_en", rezervacija.getId_poslovne_enote());
            model.addAttribute("id_os_gos", rezervacija.getId_osebe_gosti());
            model.addAttribute("st_rez", rezervacija.getStevilka_rezervacije());
            model.addAttribute("dat_cas", rezervacija.getDatum_cas());
            model.addAttribute("prihod", rezervacija.getDatum_prihod());
            model.addAttribute("odhod", rezervacija.getDatum_odhod());
            model.addAttribute("id_zaposleni", rezervacija.getId_zaposleni());
        } else {
            model.addAttribute("error", "Id ne obstaja");
        }
        return REZERVACIJE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap modelMap) {
        List<Rezervacije> list = service.getAll();
        modelMap.addAttribute("rezervacije", list);
        return REZERVACIJE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return REZERVACIJE_VIEW;
    }
}
