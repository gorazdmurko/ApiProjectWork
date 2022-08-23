package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Zaposleni;
import org.db2.murko.presker.api.healthresort.services.IZaposleniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "zaposleni")
public class ZaposleniController {

    @Autowired
    private IZaposleniService service;

    private final String ZAPOSLENI_VIEW = "zaposleniView";
    private final String ZAPOSLENI_LIST_VIEW = "zaposleniListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return ZAPOSLENI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap modelMap) {
        Zaposleni zaposleni = service.get(id);
        if (zaposleni != null) {
            zaposleni.toString();
            modelMap.addAttribute("id", zaposleni.getId_zaposleni());
            modelMap.addAttribute("od", zaposleni.getZaposlitev_od());
            modelMap.addAttribute("do", zaposleni.getZaposlitev_do());
            modelMap.addAttribute("id_osebe", zaposleni.getId_osebe());
            modelMap.addAttribute("id_pos_en", zaposleni.getId_poslovne_enote());
            modelMap.addAttribute("opis", zaposleni.getOpis());
        } else {
            modelMap.addAttribute("error", "Id ne obstaja!");
        }
        return ZAPOSLENI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap modelMap) {
        List<Zaposleni> list = service.getAll();
        modelMap.addAttribute("zaposleni", list);
        return ZAPOSLENI_LIST_VIEW;
    }

    @RequestMapping(value = "back")
    public String back() {
        return ZAPOSLENI_VIEW;
    }
}
