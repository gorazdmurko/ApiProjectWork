package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Blagajne;
import org.db2.murko.presker.api.healthresort.entity.RezervacijeDnevnik;
import org.db2.murko.presker.api.healthresort.services.IRezervacijeDnevnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/rezervacije-dnevnik")
public class RezervacijeDnevnikController {

    @Autowired
    private IRezervacijeDnevnikService service;

    private final String REZERVACIJE_DNEVNIK_VIEW = "rezervacijeDnevnikView";
    private final String REZERVACIJE_DNEVNIK_LIST_VIEW = "rezervacijeDnevnikListView";


    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return REZERVACIJE_DNEVNIK_VIEW;
    }


    @RequestMapping(value = "/getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        RezervacijeDnevnik rezervacija = service.getRezervacijeDnevnik(id);

        if (rezervacija != null) {
            rezervacija.toString();
            model.addAttribute("id", rezervacija.getId_rezervacije_dnevnik());
            model.addAttribute("datum", rezervacija.getDatum_cas());
            model.addAttribute("uporabnik", rezervacija.getUporabnik());
            model.addAttribute("operacija", rezervacija.getOperacija());
            model.addAttribute("kljuc", rezervacija.getKljuc());
        } else {
            model.addAttribute("error", "Id does not exist!");
        }
        return REZERVACIJE_DNEVNIK_VIEW;
    }

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<RezervacijeDnevnik> dnevniki = service.getRezervacijeDnevnikAll();
        System.out.println("List of RezervacijeDnevnik: " + dnevniki);
        model.addAttribute("dnevniki", dnevniki);
        return REZERVACIJE_DNEVNIK_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return REZERVACIJE_DNEVNIK_VIEW;
    }
}
