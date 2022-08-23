package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.VrstePlacil;
import org.db2.murko.presker.api.healthresort.services.IVrstePlacilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "vrste-placil")
public class VrstePlacilController {

    @Autowired
    private IVrstePlacilService service;
    private final String VRSTE_PLACIL_VIEW = "vrstePlacilView";
    private final String VRSTE_PLACIL_LIST_VIEW = "vrstePlacilListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return VRSTE_PLACIL_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap modelMap) {
        VrstePlacil vrsta = service.get(id);
        if (vrsta != null) {
            vrsta.toString();
            modelMap.addAttribute("id", vrsta.getId_vrste_placil());
            modelMap.addAttribute("vrsta_pl", vrsta.getVrsta_placila());
        } else {
            modelMap.addAttribute("error", "Id ne obstaja!");
        }
        return VRSTE_PLACIL_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap modelMap) {
        List<VrstePlacil> vrste = service.getAll();
        modelMap.addAttribute("vrste", vrste);
        return VRSTE_PLACIL_LIST_VIEW;
    }

    @RequestMapping(value = "back")
    public String back() {
        return VRSTE_PLACIL_VIEW;
    }
}
