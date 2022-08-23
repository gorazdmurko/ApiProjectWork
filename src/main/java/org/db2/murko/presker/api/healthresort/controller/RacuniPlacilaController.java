package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.RacuniPlacila;
import org.db2.murko.presker.api.healthresort.services.IRacuniPlacilaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/racuni-placila")
public class RacuniPlacilaController {

    @Autowired
    private IRacuniPlacilaService service;

    private final String RACUNI_PLACILA_VIEW = "racuniPlacilaView";
    private final String RACUNI_PLACILA_LIST_VIEW = "racuniPlacilaListView";

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return RACUNI_PLACILA_VIEW;
    }

    @RequestMapping(value = "/getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        RacuniPlacila racun = service.get(id);
        if (racun != null) {
            racun.toString();
            model.addAttribute("id_rac_pl", racun.getId_racuni_placila());
            model.addAttribute("datum", racun.getDatum());
            model.addAttribute("znesek", racun.getZnesek());
            model.addAttribute("id_vrste_pl", racun.getId_vrste_placil());
            model.addAttribute("id_izd_rac", racun.getId_izdani_racuni());
        } else {
            model.addAttribute("error", "Id ne obstaja");
        }
        return RACUNI_PLACILA_VIEW;
    }

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<RacuniPlacila> list = service.getAll();
        model.addAttribute("racuni", list);
        return RACUNI_PLACILA_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return RACUNI_PLACILA_VIEW;
    }
}
