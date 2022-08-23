package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.RezervacijePozicije;
import org.db2.murko.presker.api.healthresort.services.IRezervacijePozicijeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/rezervacije-pozicije")
public class RezervacijePozicijeController {

    @Autowired
    private IRezervacijePozicijeService service;

    private final String POZICIJE_VIEW = "rezervacijePozicijeView";
    private final String POZICIJE_LIST_VIEW = "rezervacijePozicijeListView";

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return POZICIJE_VIEW;
    }

    @RequestMapping(value = "/getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap modelMap) {
        RezervacijePozicije pozicija = service.get(id);
        if (pozicija != null) {
            pozicija.toString();
            modelMap.addAttribute("id_rez_poz", pozicija.getId_rezervacije_pozicije());
            modelMap.addAttribute("id_rez", pozicija.getId_rezervacije());
            modelMap.addAttribute("id_izd_sto", pozicija.getId_izdelki_storitve());
            modelMap.addAttribute("kolicina", pozicija.getKolicina());
            modelMap.addAttribute("cena", pozicija.getProdajna_cena());
            modelMap.addAttribute("popust", pozicija.getPopust());
            modelMap.addAttribute("prihod", pozicija.getDatum_prihod());
            modelMap.addAttribute("odhod", pozicija.getDatum_odhod());
        } else {
            modelMap.addAttribute("error", "Id ne obstaja!");
        }
        return POZICIJE_VIEW;
    }

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public String getList(ModelMap modelMap) {
        List<RezervacijePozicije> list = service.getAll();
        modelMap.addAttribute("rezervacije", list);
        return POZICIJE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return POZICIJE_VIEW;
    }
}
