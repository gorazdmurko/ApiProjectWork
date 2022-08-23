package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Osebe;
import org.db2.murko.presker.api.healthresort.services.IOsebeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "osebe")
public class OsebeController {

    @Autowired
    private IOsebeService service;

    private final String OSEBE_VIEW = "osebeView";
    private final String OSEBE_LIST_VIEW = "osebeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return OSEBE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        Osebe oseba = service.get(id);
        if (oseba != null) {
            oseba.toString();
            model.addAttribute("id_osebe", oseba.getId_osebe());
            model.addAttribute("ime", oseba.getIme());
            model.addAttribute("priimek", oseba.getPriimek());
            model.addAttribute("emso", oseba.getEmso());
            model.addAttribute("spol", oseba.getSpol());
            model.addAttribute("dat_roj", oseba.getDatum_rojstva());
            model.addAttribute("naslov", oseba.getNaslov());
            model.addAttribute("enaslov", oseba.getEnaslov());
            model.addAttribute("telefon", oseba.getTelefon());
            model.addAttribute("davcna", oseba.getDavcna_stevilka());
            model.addAttribute("id_pos_ste", oseba.getId_postne_stevilke());
        } else {
            model.addAttribute("error", "Id ne obstaja");
        }
        return OSEBE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<Osebe> osebe = service.getAll();
        model.addAttribute("osebe", osebe);
        return OSEBE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return OSEBE_VIEW;
    }
}
