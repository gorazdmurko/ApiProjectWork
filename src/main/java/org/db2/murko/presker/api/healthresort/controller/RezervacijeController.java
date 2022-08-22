package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class RezervacijeController {

    // service

    private final String REZERVACIJE_VIEW = "rezervacijeView";
    private final String REZERVACIJE_LIST_VIEW = "rezervacijeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return REZERVACIJE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return REZERVACIJE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return REZERVACIJE_VIEW;
    }
}
