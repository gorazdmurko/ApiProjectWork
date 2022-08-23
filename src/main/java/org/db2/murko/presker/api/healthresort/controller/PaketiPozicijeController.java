package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.PaketiPozicije;
import org.db2.murko.presker.api.healthresort.services.IPaketiPozicijeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "paketi-pozicije")
public class PaketiPozicijeController {

    @Autowired
    private IPaketiPozicijeService service;

    private final String PAKETI_POZICIJE_VIEW = "paketiPozicijeView";
    private final String PAKETI_POZICIJE_LIST_VIEW = "paketiPozicijeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return PAKETI_POZICIJE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        PaketiPozicije paket = service.get(id);
        if (paket != null) {
            paket.toString();
            model.addAttribute("id_pak_poz", paket.getId_paketi_pozicije());
            model.addAttribute("id_izd_sto_pak", paket.getId_izdelki_storitve_paketi());
            model.addAttribute("id_izd_sto", paket.getId_izdelki_storitve());
            model.addAttribute("kolicina", paket.getKolicina());
        } else {
            model.addAttribute("error", "Id ne obstaja");
        }
        return PAKETI_POZICIJE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<PaketiPozicije> list = service.getAll();
        model.addAttribute("paketi", list);
        return PAKETI_POZICIJE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return PAKETI_POZICIJE_VIEW;
    }
}
