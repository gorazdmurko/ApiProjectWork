package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Oddelki;
import org.db2.murko.presker.api.healthresort.services.IOddelkiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "oddelki")
public class OddelkiController {

    @Autowired
    private IOddelkiService service;

    private final String ODDELKI_VIEW = "oddelkiView";
    private final String ODDELKI_LIST_VIEW = "oddelkiListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return ODDELKI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        Oddelki oddelek = service.get(id);
        if (oddelek != null) {
            oddelek.toString();
            model.addAttribute("id_oddelka", oddelek.getId_oddelki());
            model.addAttribute("naziv", oddelek.getOddelek_naziv());
            model.addAttribute("ste_oddelka", oddelek.getStevilka_oddelka());
            model.addAttribute("id_pos_en_zdr", oddelek.getId_poslovne_enote_zdravilisce());
            model.addAttribute("tel", oddelek.getTelefon());
            model.addAttribute("opis", oddelek.getOpis());
            model.addAttribute("id_pp_zun_izv", oddelek.getId_pp_zunanji_izvajalec());
        } else {
            model.addAttribute("error", "Id ne obstaja");
        }
        return ODDELKI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<Oddelki> list = service.getAll();
        model.addAttribute("oddelki", list);
        return ODDELKI_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return ODDELKI_VIEW;
    }

}