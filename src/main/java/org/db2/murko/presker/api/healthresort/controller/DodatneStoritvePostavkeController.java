package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.DodatneStoritvePostavke;
import org.db2.murko.presker.api.healthresort.services.IDodatneStoritvePostavkeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/dodatne-storitve-postavke")
public class DodatneStoritvePostavkeController {

    @Autowired
    private IDodatneStoritvePostavkeService service;

    private final String DODATNE_STORITVE_VIEW = "dodatneStoritveView";
    private final String DODATNE_STORITVE_LIST_VIEW = "dodatneStoritveListView";

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return DODATNE_STORITVE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        DodatneStoritvePostavke storitev = service.get(id);

        if (storitev != null) {
            storitev.toString();
            model.addAttribute("id", storitev.getId_dodatne_storitve_postavke());
            model.addAttribute("id_rezervacije", storitev.getId_rezervacije_dodatne_storitve());
            model.addAttribute("id_izdelki", storitev.getId_izdelki_storitve());
            model.addAttribute("kolicina", storitev.getKolicina());
            model.addAttribute("popust", storitev.getPopust());
            model.addAttribute("zacetek", storitev.getCas_zacetek());
            model.addAttribute("konec", storitev.getCas_konec());
            model.addAttribute("opis", storitev.getOpis());
        } else {
            model.addAttribute("error", "Id does not exist!");
        }

        return DODATNE_STORITVE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap modelMap) {

        List<DodatneStoritvePostavke> list = service.getAll();
        modelMap.addAttribute("storitve", list);

        return DODATNE_STORITVE_LIST_VIEW;
    }
}
