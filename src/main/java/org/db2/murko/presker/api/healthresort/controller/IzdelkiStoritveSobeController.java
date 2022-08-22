package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class IzdelkiStoritveSobeController {

    // service

    private final String STORITVE_SOBE_VIEW = "izdelkiStoritveSobeView";
    private final String STORITVE_SOBE_LIST_VIEW = "izdelkiStoritveSobeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return STORITVE_SOBE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return STORITVE_SOBE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return STORITVE_SOBE_LIST_VIEW;
    }
}
