package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Drzave;
import org.db2.murko.presker.api.healthresort.services.IDrzaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/drzava")
public class DrzaveController {

    @Autowired
    private IDrzaveService service;

    private final String DRZAVA_VIEW = "drzavaView";
    private final String DRZAVA_LIST_VIEW = "drzavaListView";

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return DRZAVA_VIEW;
    }

    @RequestMapping(value = "getDrzava", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        Drzave drzava = service.get(id);

        if (drzava != null) {
            drzava.toString();
            model.addAttribute("id", drzava.getId_drzave());
            model.addAttribute("drzava", drzava.getDrzava());
            model.addAttribute("oznaka", drzava.getOznaka_drzave());
        } else {
            model.addAttribute("error", "Id does not exist!");
        }

        return DRZAVA_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getDrzavaList(ModelMap model) {
        List<Drzave> list = service.getAll();
        model.addAttribute("drzave", list);

        return DRZAVA_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return DRZAVA_VIEW;
    }

}
