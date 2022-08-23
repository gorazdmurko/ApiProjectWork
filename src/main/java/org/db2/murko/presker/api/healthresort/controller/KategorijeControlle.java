package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Kategorije;
import org.db2.murko.presker.api.healthresort.services.IKategorijeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "kategorije")
public class KategorijeControlle {

    private IKategorijeService service;

    private final String KATEGORIJE_VIEW = "kategorijeView";
    private final String KATEGORIJE_LIST_VIEW = "kategorijeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return KATEGORIJE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        Kategorije kategorija = service.get(id);
        if (kategorija != null) {
            kategorija.toString();
            model.addAttribute("id_kat", kategorija.getId_kategorije());
            model.addAttribute("kategorija", kategorija.getKategorija());
            model.addAttribute("oznaka", kategorija.getOznaka());
            model.addAttribute("opis", kategorija.getOpis());
            model.addAttribute("id_nad_kat", kategorija.getId_nadrejene_kategorije());
        } else {
            model.addAttribute("error", "Id ne obstaja");
        }
        return KATEGORIJE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<Kategorije> list = service.getAll();
        model.addAttribute("kategorije", list);
        return KATEGORIJE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return KATEGORIJE_VIEW;
    }
}
