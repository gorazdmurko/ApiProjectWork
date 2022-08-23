package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.SobeStatusi;
import org.db2.murko.presker.api.healthresort.services.ISobeStatusiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "sobe-statusi")
public class SobeStatusiController {

    @Autowired
    private ISobeStatusiService service;

    private final String SOBE_STATUSI_VIEW = "sobeStatusiView";
    private final String SOBE_STATUSI_LIST_VIEW = "sobeStatusiListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return SOBE_STATUSI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap modelMap) {
        SobeStatusi status = service.get(id);
        if (status != null) {
            status.toString();
            modelMap.addAttribute("id_sobe_sta", status.getId_sobe_statusi());
            modelMap.addAttribute("sobe_status", status.getSobe_status());
        } else {
            modelMap.addAttribute("error", "Id ne obstaja!");
        }
        return SOBE_STATUSI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap modelMap) {
        List<SobeStatusi> list = service.getAll();
        modelMap.addAttribute("sobe_statusi", list);
        return SOBE_STATUSI_LIST_VIEW;
    }

    @RequestMapping(value = "back")
    public String back() {
        return SOBE_STATUSI_VIEW;
    }
}
