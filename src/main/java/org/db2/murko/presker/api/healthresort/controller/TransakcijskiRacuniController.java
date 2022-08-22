package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class TransakcijskiRacuniController {

    // service

    private final String RACUNI_VIEW = "transakcijskiRacuniView";
    private final String RACUNI_LIST_VIEW = "transakcijskiRacuniListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return RACUNI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return RACUNI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return RACUNI_LIST_VIEW;
    }
}
