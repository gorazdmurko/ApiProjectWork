package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.PoslovneEnote;
import org.db2.murko.presker.api.healthresort.services.IPoslovneEnoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/poslovne_enote")
public class PoslovneEnoteController {

    @Autowired
    IPoslovneEnoteService service;

    private final String ENOTE_VIEW = "poslovneEnoteView";
    private final String ENOTE_LIST_VIEW = "poslovneEnoteListView";

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return ENOTE_VIEW;
    }

    @RequestMapping(value = "/getEnota", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        PoslovneEnote enota = service.getEnota(id);

        if (enota != null) {
            System.out.println("Enota: " + enota);
            model.addAttribute("id", enota.getId_poslovne_enote());
            model.addAttribute("enota", enota.getPoslovna_enota());
            model.addAttribute("oznaka", enota.getOznaka_poslovne_enote());
            model.addAttribute("naslov", enota.getNaslov());
            model.addAttribute("kraj", enota.getKraj_izdaje_racuna());
            model.addAttribute("posta", enota.getId_postne_stevilke());
        } else {
            model.addAttribute("error", "Id does not exist!");
        }

        return ENOTE_VIEW;
    }

    @RequestMapping(value = "/getEnotaList", method = RequestMethod.GET)
    public String getEnotaList(ModelMap model) {
        List<PoslovneEnote> enote = service.getEnoteAll();
        System.out.println("List of Enote: " + enote);
        model.addAttribute("enote", enote);
        return ENOTE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return ENOTE_VIEW;
    }
}
