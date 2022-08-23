package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.IzdelkiStoritveSobe;
import org.db2.murko.presker.api.healthresort.services.IIzdelkiStoritveSobeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "izdelki-storitve-sobe")
public class IzdelkiStoritveSobeController {

    @Autowired
    private IIzdelkiStoritveSobeService service;

    private final String STORITVE_SOBE_VIEW = "izdelkiStoritveSobeView";
    private final String STORITVE_SOBE_LIST_VIEW = "izdelkiStoritveSobeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return STORITVE_SOBE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        IzdelkiStoritveSobe soba = service.get(id);
        if (soba != null) {
            soba.toString();
            model.addAttribute("id_izd_sto_so", soba.getId_izdelki_storitve_sobe());
            model.addAttribute("id_rez_sob", soba.getId_rezervacije_sobe());
            model.addAttribute("id_izd_sto", soba.getId_izdelki_storitve());
            model.addAttribute("kolicina", soba.getKolicina());
        } else {
            model.addAttribute("error", "Id ne obstaja");
        }
        return STORITVE_SOBE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<IzdelkiStoritveSobe> list = service.getAll();
        model.addAttribute("sobe", list);
        return STORITVE_SOBE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return STORITVE_SOBE_VIEW;
    }
}
