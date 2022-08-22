package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class SobeController {

    // service

    private final String SOBE_VIEW = "sobeView";
    private final String SOBE_LIST_VIEW = "sobeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return SOBE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return SOBE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return SOBE_LIST_VIEW;
    }
}
