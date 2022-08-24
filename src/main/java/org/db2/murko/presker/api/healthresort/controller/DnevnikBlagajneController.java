package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.DnevnikBlagajne;
import org.db2.murko.presker.api.healthresort.services.IDnevnikBlagajneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "dnevnik-blagajne")
public class DnevnikBlagajneController {

    @Autowired
    private IDnevnikBlagajneService service;

    private final String DNEVNIK_BLAGAJNE_VIEW = "dnevnikBlagajneView";
    private final String DNEVNIK_BLAGAJNE_LIST_VIEW = "dnevnikBlagajneListView";


    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return DNEVNIK_BLAGAJNE_VIEW;
    }


    @RequestMapping(value = "/getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        DnevnikBlagajne dnevnik = service.getDnevnikBlagajne(id);

        if (dnevnik != null) {
            dnevnik.toString();
            model.addAttribute("id", dnevnik.getId_dnevnik_blagajne());
            model.addAttribute("datum", dnevnik.getDatum_cas());
            model.addAttribute("uporabnik", dnevnik.getUporabnik());
            model.addAttribute("operacija", dnevnik.getOperacija());
            model.addAttribute("kljuc", dnevnik.getKljuc());
        } else {
            model.addAttribute("error", "Id does not exist!");
        }
        return DNEVNIK_BLAGAJNE_VIEW;
    }

    @RequestMapping(value = "/getList")
    public String getBlagajneList(ModelMap model) {
        List<DnevnikBlagajne> dnevnik = service.getDnevnikBlagajneAll();
        System.out.println("List of DnevnikBlagajne: " + dnevnik);
        model.addAttribute("dnevnik", dnevnik);
        return DNEVNIK_BLAGAJNE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return DNEVNIK_BLAGAJNE_VIEW;
    }
}
