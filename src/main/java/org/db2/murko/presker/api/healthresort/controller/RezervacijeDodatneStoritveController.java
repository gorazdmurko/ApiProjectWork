package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.RezervacijeDodatneStoritve;
import org.db2.murko.presker.api.healthresort.services.IRezervacijeDodatneStoritveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "rezervacije-dodatne-storitve")
public class RezervacijeDodatneStoritveController {

    @Autowired
    private IRezervacijeDodatneStoritveService service;

    private final String STORITVE_VIEW = "rezervacijeDodatneStoritveView";
    private final String STORITVE_LIST_VIEW = "rezervacijeDodatneStoritveListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return STORITVE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap modelMap) {
        RezervacijeDodatneStoritve storitev = service.get(id);
        if (storitev != null) {
            storitev.toString();
            modelMap.addAttribute("id_rez_dod_sto", storitev.getId_rezervacije_dodatne_storitve());
            modelMap.addAttribute("dat_rez", storitev.getDatum_rezervacije());
            modelMap.addAttribute("id_osebe", storitev.getId_osebe());
            modelMap.addAttribute("id_oddelki", storitev.getId_oddelki());
            modelMap.addAttribute("opis", storitev.getOpis());
        } else {
            modelMap.addAttribute("error", "Id ne obstaja!");
        }
        return STORITVE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap modelMap) {
        List<RezervacijeDodatneStoritve> list = service.getAll();
        modelMap.addAttribute("storitve", list);
        return STORITVE_LIST_VIEW;
    }

    @RequestMapping(value = "back")
    public String back() {
        return STORITVE_VIEW;
    }
}
