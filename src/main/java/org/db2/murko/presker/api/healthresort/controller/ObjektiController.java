package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Objekti;
import org.db2.murko.presker.api.healthresort.services.IObjektiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "objekti")
public class ObjektiController {

    @Autowired
    private IObjektiService service;

    private final String OBJEKTI_VIEW = "objektiView";
    private final String OBJEKTI_LIST_VIEW = "objektiListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return OBJEKTI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        Objekti objekt = service.get(id);
        if (objekt != null) {
            objekt.toString();
            model.addAttribute("id_objekta", objekt.getId_objekti());
            model.addAttribute("objekt", objekt.getObjekt());
            model.addAttribute("opis", objekt.getOpis());
            model.addAttribute("id_pos_en", objekt.getId_poslovne_enote());
        } else {
            model.addAttribute("error", "Id ne obstaja");
        }
        return OBJEKTI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<Objekti> list = service.getAll();
        model.addAttribute("objekti", list);
        return OBJEKTI_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return OBJEKTI_VIEW;
    }
}
