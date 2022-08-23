package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.PPKontakti;
import org.db2.murko.presker.api.healthresort.services.IPPKontaktiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "kontakti")
public class PPKontaktiController {

    @Autowired
    private IPPKontaktiService service;

    private final String KONTAKTI_VIEW = "ppKontaktiView";
    private final String KONTAKTI_LIST_VIEW = "ppKontaktiListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return KONTAKTI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        PPKontakti kontakt = service.get(id);
        if (kontakt != null) {
            kontakt.toString();
            model.addAttribute("id_kontakti", kontakt.getId_pp_kontakti());
            model.addAttribute("tel", kontakt.getTelefon());
            model.addAttribute("e-naslov", kontakt.getEnaslov());
            model.addAttribute("id_osebe", kontakt.getId_osebe());
            model.addAttribute("id_pos_par", kontakt.getId_poslovni_partnerji());
        } else {
            model.addAttribute("error", "Id ne obstaja");
        }
        return KONTAKTI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        return KONTAKTI_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return KONTAKTI_VIEW;
    }
}
