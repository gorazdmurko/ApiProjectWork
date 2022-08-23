package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.TransakcijskiRacunPoslovneEnote;
import org.db2.murko.presker.api.healthresort.services.ITransakcijskiRacunPoslovneEnoteServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "transakcijski-racuni-enote")
public class TransakcijskiRacunPoslovneEnoteController {

    @Autowired
    private ITransakcijskiRacunPoslovneEnoteServis service;

    private final String T_RACUNI_ENOTE_VIEW = "transakcijskiRacuniposlovneEnoteView";
    private final String T_RACUNI_ENOTE_LIST_VIEW = "transakcijskiRacuniposlovneEnoteListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return T_RACUNI_ENOTE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap modelMap) {
        TransakcijskiRacunPoslovneEnote enota = service.get(id);
        if (enota != null) {
            enota.toString();
            modelMap.addAttribute("id_tr_rac_po_en", enota.getId_transakcijski_racuni_poslovne_enote());
            modelMap.addAttribute("tr_rac", enota.getTransakcijski_racun());
            modelMap.addAttribute("id_pos_en", enota.getId_poslovne_enote());
            modelMap.addAttribute("id_pp_banke", enota.getId_pp_banke());
            modelMap.addAttribute("privzeti", enota.isPrivzeti());
        } else {
            modelMap.addAttribute("error", "Id ne obstaja!");
        }
        return T_RACUNI_ENOTE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<TransakcijskiRacunPoslovneEnote> list = service.getAll();
        model.addAttribute("enote", list);
        return T_RACUNI_ENOTE_LIST_VIEW;
    }

    @RequestMapping(value = "back")
    public String back() {
        return T_RACUNI_ENOTE_VIEW;
    }
}
