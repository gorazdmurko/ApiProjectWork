package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.DavcneStopnje;
import org.db2.murko.presker.api.healthresort.services.IDavcneStopnjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/davcne-stopnje")
public class DavcneStopnjeController {

    @Autowired
    private IDavcneStopnjeService service;

    private final String DAVCNE_STOPNJE_VIEW = "davcneStopnjeView";
    private final String DAVCNE_STOPNJE_LIST_VIEW = "davcneStopnjeListView";

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return DAVCNE_STOPNJE_VIEW;
    }

    @RequestMapping(value = "/getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        DavcneStopnje stopnja = service.get(id);

        if (stopnja != null) {
            stopnja.toString();
            model.addAttribute("id", stopnja.getId_davcne_stopnje());
            model.addAttribute("oznaka", stopnja.getOznaka_ddv());
            model.addAttribute("stopnja", stopnja.getDavcna_stopnja());
            model.addAttribute("odstotek", stopnja.getOdstotek());
        } else {
            model.addAttribute("error", "Id does not exist!");
        }

        return DAVCNE_STOPNJE_VIEW;
    }

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public String getDrzavaList(ModelMap model) {
        List<DavcneStopnje> list = service.getAll();
        model.addAttribute("stopnje", list);

        return DAVCNE_STOPNJE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return DAVCNE_STOPNJE_VIEW;
    }
}
